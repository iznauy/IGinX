/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package cn.edu.tsinghua.iginx.split;

import cn.edu.tsinghua.iginx.conf.ConfigDescriptor;
import cn.edu.tsinghua.iginx.core.context.AddColumnsContext;
import cn.edu.tsinghua.iginx.core.context.AggregateQueryContext;
import cn.edu.tsinghua.iginx.core.context.CreateDatabaseContext;
import cn.edu.tsinghua.iginx.core.context.DeleteColumnsContext;
import cn.edu.tsinghua.iginx.core.context.DeleteDataInColumnsContext;
import cn.edu.tsinghua.iginx.core.context.DropDatabaseContext;
import cn.edu.tsinghua.iginx.core.context.InsertColumnRecordsContext;
import cn.edu.tsinghua.iginx.core.context.InsertRowRecordsContext;
import cn.edu.tsinghua.iginx.core.context.QueryDataContext;
import cn.edu.tsinghua.iginx.core.context.RequestContext;
import cn.edu.tsinghua.iginx.metadata.SortedListAbstractMetaManager;
import cn.edu.tsinghua.iginx.metadata.entity.StorageEngineMeta;
import cn.edu.tsinghua.iginx.plan.AddColumnsPlan;
import cn.edu.tsinghua.iginx.plan.AvgQueryPlan;
import cn.edu.tsinghua.iginx.plan.CountQueryPlan;
import cn.edu.tsinghua.iginx.plan.CreateDatabasePlan;
import cn.edu.tsinghua.iginx.plan.DeleteColumnsPlan;
import cn.edu.tsinghua.iginx.plan.DeleteDataInColumnsPlan;
import cn.edu.tsinghua.iginx.plan.DropDatabasePlan;
import cn.edu.tsinghua.iginx.plan.FirstQueryPlan;
import cn.edu.tsinghua.iginx.plan.IginxPlan;
import cn.edu.tsinghua.iginx.plan.InsertColumnRecordsPlan;
import cn.edu.tsinghua.iginx.plan.InsertRowRecordsPlan;
import cn.edu.tsinghua.iginx.plan.LastQueryPlan;
import cn.edu.tsinghua.iginx.plan.MaxQueryPlan;
import cn.edu.tsinghua.iginx.plan.MinQueryPlan;
import cn.edu.tsinghua.iginx.plan.QueryDataPlan;
import cn.edu.tsinghua.iginx.plan.SumQueryPlan;
import cn.edu.tsinghua.iginx.policy.IPlanSplitter;
import cn.edu.tsinghua.iginx.policy.PolicyManager;
import cn.edu.tsinghua.iginx.thrift.AddColumnsReq;
import cn.edu.tsinghua.iginx.thrift.AggregateQueryReq;
import cn.edu.tsinghua.iginx.thrift.CreateDatabaseReq;
import cn.edu.tsinghua.iginx.thrift.DeleteColumnsReq;
import cn.edu.tsinghua.iginx.thrift.DeleteDataInColumnsReq;
import cn.edu.tsinghua.iginx.thrift.DropDatabaseReq;
import cn.edu.tsinghua.iginx.thrift.InsertColumnRecordsReq;
import cn.edu.tsinghua.iginx.thrift.InsertRowRecordsReq;
import cn.edu.tsinghua.iginx.thrift.QueryDataReq;
import cn.edu.tsinghua.iginx.utils.Bitmap;
import cn.edu.tsinghua.iginx.utils.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static cn.edu.tsinghua.iginx.utils.ByteUtils.getLongArrayFromByteArray;
import static cn.edu.tsinghua.iginx.utils.ByteUtils.getRowValuesListByDataType;
import static cn.edu.tsinghua.iginx.utils.ByteUtils.getValuesListByDataType;

public class SimplePlanGenerator implements IPlanGenerator {

    private static final Logger logger = LoggerFactory.getLogger(SimplePlanGenerator.class);

    private final IPlanSplitter planSplitter = PolicyManager.getInstance()
            .getPolicy(ConfigDescriptor.getInstance().getConfig().getPolicyClassName()).getIPlanSplitter();

    @Override
    public List<? extends IginxPlan> generateSubPlans(RequestContext requestContext) {
        List<SplitInfo> splitInfoList;
        switch (requestContext.getType()) {
            case CreateDatabase:
                CreateDatabaseReq createDatabaseReq = ((CreateDatabaseContext) requestContext).getReq();
                return SortedListAbstractMetaManager.getInstance().getStorageEngineList().stream().map(StorageEngineMeta::getId)
                        .map(e -> new CreateDatabasePlan(createDatabaseReq.getDatabaseName(), e)).collect(Collectors.toList());
            case DropDatabase:
                DropDatabaseReq dropDatabaseReq = ((DropDatabaseContext) requestContext).getReq();
                return SortedListAbstractMetaManager.getInstance().getStorageEngineList().stream().map(StorageEngineMeta::getId)
                        .map(e -> new DropDatabasePlan(dropDatabaseReq.getDatabaseName(), e)).collect(Collectors.toList());
            case AddColumns:
                AddColumnsReq addColumnsReq = ((AddColumnsContext) requestContext).getReq();
                AddColumnsPlan addColumnsPlan = new AddColumnsPlan(addColumnsReq.getPaths(), addColumnsReq.getAttributesList());
                splitInfoList = planSplitter.getSplitAddColumnsPlanResults(addColumnsPlan);
                return splitAddColumnsPlan(addColumnsPlan, splitInfoList);
            case DeleteColumns:
                DeleteColumnsReq deleteColumnsReq = ((DeleteColumnsContext) requestContext).getReq();
                DeleteColumnsPlan deleteColumnsPlan = new DeleteColumnsPlan(deleteColumnsReq.getPaths());
                splitInfoList = planSplitter.getSplitDeleteColumnsPlanResults(deleteColumnsPlan);
                return splitDeleteColumnsPlan(deleteColumnsPlan, splitInfoList);
            case InsertColumnRecords:
                InsertColumnRecordsReq insertColumnRecordsReq = ((InsertColumnRecordsContext) requestContext).getReq();
                InsertColumnRecordsPlan insertColumnRecordsPlan = new InsertColumnRecordsPlan(
                        insertColumnRecordsReq.getPaths(),
                        getLongArrayFromByteArray(insertColumnRecordsReq.getTimestamps()),
                        getValuesListByDataType(insertColumnRecordsReq.getValuesList(), insertColumnRecordsReq.getDataTypeList()),
                        null,
                        insertColumnRecordsReq.getDataTypeList(),
                        insertColumnRecordsReq.getAttributesList(),
                        0L,
                        ""
                );
                splitInfoList = planSplitter.getSplitInsertColumnRecordsPlanResults(insertColumnRecordsPlan);
                return splitInsertColumnRecordsPlan(insertColumnRecordsPlan, splitInfoList);
            case InsertRowRecords:
                InsertRowRecordsReq insertRowRecordsReq = ((InsertRowRecordsContext) requestContext).getReq();
                InsertRowRecordsPlan insertRowRecordsPlan = new InsertRowRecordsPlan(
                        insertRowRecordsReq.getPaths(),
                        getLongArrayFromByteArray(insertRowRecordsReq.getTimestamps()),
                        getRowValuesListByDataType(insertRowRecordsReq.getValuesList(), insertRowRecordsReq.getDataTypeList(), insertRowRecordsReq.getBitmapList()),
                        insertRowRecordsReq.getBitmapList().stream().map(x -> new Bitmap(insertRowRecordsReq.getPathsSize(), x.array())).collect(Collectors.toList()),
                        insertRowRecordsReq.getDataTypeList(),
                        insertRowRecordsReq.getAttributesList(),
                        0L,
                        ""
                );
                splitInfoList = planSplitter.getSplitInsertRowRecordsPlanResults(insertRowRecordsPlan);
                return splitInsertRowRecordsPlan(insertRowRecordsPlan, splitInfoList);
            case DeleteDataInColumns:
                DeleteDataInColumnsReq deleteDataInColumnsReq = ((DeleteDataInColumnsContext) requestContext).getReq();
                DeleteDataInColumnsPlan deleteDataInColumnsPlan = new DeleteDataInColumnsPlan(
                        deleteDataInColumnsReq.getPaths(),
                        deleteDataInColumnsReq.getStartTime(),
                        deleteDataInColumnsReq.getEndTime(),
                        0L,
                        ""
                );
                splitInfoList = planSplitter.getSplitDeleteDataInColumnsPlanResults(deleteDataInColumnsPlan);
                return splitDeleteDataInColumnsPlan(deleteDataInColumnsPlan, splitInfoList);
            case QueryData:
                QueryDataReq queryDataReq = ((QueryDataContext) requestContext).getReq();
                QueryDataPlan queryDataPlan = new QueryDataPlan(
                        queryDataReq.getPaths(),
                        queryDataReq.getStartTime(),
                        queryDataReq.getEndTime(),
                        0L,
                        ""
                );
                splitInfoList = planSplitter.getSplitQueryDataPlanResults(queryDataPlan);
                return splitQueryDataPlan(queryDataPlan, splitInfoList);
            case AggregateQuery:
                AggregateQueryReq aggregateQueryReq = ((AggregateQueryContext) requestContext).getReq();
                switch (aggregateQueryReq.getAggregateType()) {
                    case MAX:
                        MaxQueryPlan maxQueryPlan = new MaxQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitMaxQueryPlanResults(maxQueryPlan);
                        return splitMaxQueryPlan(maxQueryPlan, splitInfoList);
                    case MIN:
                        MinQueryPlan minQueryPlan = new MinQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitMinQueryPlanResults(minQueryPlan);
                        return splitMinQueryPlan(minQueryPlan, splitInfoList);
                    case FIRST:
                        FirstQueryPlan firstQueryPlan = new FirstQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitFirstQueryPlanResults(firstQueryPlan);
                        return splitFirstQueryPlan(firstQueryPlan, splitInfoList);
                    case LAST:
                        LastQueryPlan lastQueryPlan = new LastQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitLastQueryPlanResults(lastQueryPlan);
                        return splitLastQueryPlan(lastQueryPlan, splitInfoList);
                    case AVG:
                        AvgQueryPlan avgQueryPlan = new AvgQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitAvgQueryPlanResults(avgQueryPlan);
                        return splitAvgQueryPlan(avgQueryPlan, splitInfoList);
                    case SUM:
                        SumQueryPlan sumQueryPlan = new SumQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitSumQueryPlanResults(sumQueryPlan);
                        return splitSumQueryPlan(sumQueryPlan, splitInfoList);
                    case COUNT:
                        CountQueryPlan countQueryPlan = new CountQueryPlan(
                                aggregateQueryReq.getPaths(),
                                aggregateQueryReq.getStartTime(),
                                aggregateQueryReq.getEndTime(),
                                0L,
                                ""
                        );
                        splitInfoList = planSplitter.getSplitCountQueryPlanResults(countQueryPlan);
                        return splitCountQueryPlan(countQueryPlan, splitInfoList);
                    default:
                        throw new UnsupportedOperationException(aggregateQueryReq.getAggregateType().toString());
                }
            default:
                throw new UnsupportedOperationException(requestContext.getType().toString());
        }
    }

    public List<AddColumnsPlan> splitAddColumnsPlan(AddColumnsPlan plan, List<SplitInfo> infoList) {
        List<AddColumnsPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            AddColumnsPlan subPlan = new AddColumnsPlan(plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    plan.getAttributesByInterval(info.getTimeSeriesInterval()));
            subPlan.setStorageEngineId(info.getReplica().getStorageEngineId());
            plans.add(subPlan);
        }
        return plans;
    }

    public List<DeleteColumnsPlan> splitDeleteColumnsPlan(DeleteColumnsPlan plan, List<SplitInfo> infoList) {
        List<DeleteColumnsPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            DeleteColumnsPlan subPlan = new DeleteColumnsPlan(plan.getPathsByInterval(info.getTimeSeriesInterval()));
            subPlan.setStorageEngineId(info.getReplica().getStorageEngineId());
            plans.add(subPlan);
        }
        return plans;
    }

    public List<InsertColumnRecordsPlan> splitInsertColumnRecordsPlan(InsertColumnRecordsPlan plan, List<SplitInfo> infoList) {
        List<InsertColumnRecordsPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            Pair<long[], Pair<Integer, Integer>> timestampsAndIndexes = plan.getTimestampsAndIndexesByInterval(info.getTimeInterval());
            InsertColumnRecordsPlan subPlan = new InsertColumnRecordsPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    timestampsAndIndexes.k,
                    plan.getValuesByIndexes(timestampsAndIndexes.v, info.getTimeSeriesInterval()),
                    null,
                    plan.getDataTypeListByInterval(info.getTimeSeriesInterval()),
                    plan.getAttributesByInterval(info.getTimeSeriesInterval()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            subPlan.setSync(info.getReplica().getReplicaIndex() == 0);
            plans.add(subPlan);
        }
        return plans;
    }

    public List<InsertRowRecordsPlan> splitInsertRowRecordsPlan(InsertRowRecordsPlan plan, List<SplitInfo> infoList) {
        List<InsertRowRecordsPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            Pair<long[], Pair<Integer, Integer>> timestampsAndIndexes = plan.getTimestampsAndIndexesByInterval(info.getTimeInterval());
            Pair<Object[], List<Bitmap>> valuesAndBitmaps = plan.getValuesAndBitmapsByIndexes(timestampsAndIndexes.v, info.getTimeSeriesInterval());
            InsertRowRecordsPlan subPlan = new InsertRowRecordsPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    timestampsAndIndexes.k,
                    valuesAndBitmaps.k,
                    valuesAndBitmaps.v,
                    plan.getDataTypeListByInterval(info.getTimeSeriesInterval()),
                    plan.getAttributesByInterval(info.getTimeSeriesInterval()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            subPlan.setSync(info.getReplica().getReplicaIndex() == 0);
            plans.add(subPlan);
        }
        return plans;
    }

    public List<DeleteDataInColumnsPlan> splitDeleteDataInColumnsPlan(DeleteDataInColumnsPlan plan, List<SplitInfo> infoList) {
        List<DeleteDataInColumnsPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            DeleteDataInColumnsPlan subPlan = new DeleteDataInColumnsPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<QueryDataPlan> splitQueryDataPlan(QueryDataPlan plan, List<SplitInfo> infoList) {
        List<QueryDataPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            QueryDataPlan subPlan = new QueryDataPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<MaxQueryPlan> splitMaxQueryPlan(MaxQueryPlan plan, List<SplitInfo> infoList) {
        List<MaxQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            MaxQueryPlan subPlan = new MaxQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<MinQueryPlan> splitMinQueryPlan(MinQueryPlan plan, List<SplitInfo> infoList) {
        List<MinQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            MinQueryPlan subPlan = new MinQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<FirstQueryPlan> splitFirstQueryPlan(FirstQueryPlan plan, List<SplitInfo> infoList) {
        List<FirstQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            FirstQueryPlan subPlan = new FirstQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<LastQueryPlan> splitLastQueryPlan(LastQueryPlan plan, List<SplitInfo> infoList) {
        List<LastQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            LastQueryPlan subPlan = new LastQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<CountQueryPlan> splitCountQueryPlan(CountQueryPlan plan, List<SplitInfo> infoList) {
        List<CountQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            CountQueryPlan subPlan = new CountQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<SumQueryPlan> splitSumQueryPlan(SumQueryPlan plan, List<SplitInfo> infoList) {
        List<SumQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            SumQueryPlan subPlan = new SumQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }

    public List<AvgQueryPlan> splitAvgQueryPlan(AvgQueryPlan plan, List<SplitInfo> infoList) {
        List<AvgQueryPlan> plans = new ArrayList<>();
        for (SplitInfo info : infoList) {
            AvgQueryPlan subPlan = new AvgQueryPlan(
                    plan.getPathsByInterval(info.getTimeSeriesInterval()),
                    Math.max(plan.getStartTime(), info.getReplica().getStartTime()),
                    Math.min(plan.getEndTime(), info.getReplica().getEndTime()),
                    info.getReplica().getStorageEngineId(),
                    info.getStorageUnitId()
            );
            plans.add(subPlan);
        }
        return plans;
    }
}
