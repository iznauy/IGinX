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
package cn.edu.tsinghua.iginx.plan.downsample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DownsampleSumQueryPlan extends DownsampleQueryPlan {

    private static final Logger logger = LoggerFactory.getLogger(DownsampleSumQueryPlan.class);

    public DownsampleSumQueryPlan(List<String> paths, long startTime, long endTime, long precision) {
        super(paths, startTime, endTime, precision);
        this.setIginxPlanType(IginxPlanType.DOWNSAMPLE_SUM);
    }

    public DownsampleSumQueryPlan(List<String> paths, long startTime, long endTime, long precision, long storageEngineId) {
        super(paths, startTime, endTime, precision, storageEngineId);
        this.setIginxPlanType(IginxPlanType.DOWNSAMPLE_SUM);
    }

}