package cn.edu.tsinghua.iginx.engine.physical.fault;

import cn.edu.tsinghua.iginx.engine.physical.exception.PhysicalException;
import cn.edu.tsinghua.iginx.engine.physical.task.PhysicalTask;
import cn.edu.tsinghua.iginx.engine.physical.task.TaskExecuteResult;
import cn.edu.tsinghua.iginx.engine.shared.data.read.RowStream;
import cn.edu.tsinghua.iginx.sharedstore.utils.RowStreamHolder;
import cn.edu.tsinghua.iginx.sharedstore.utils.RowStreamStoreUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractFaultTolerancePolicy implements FaultTolerancePolicy {

    private static final Logger logger = LoggerFactory.getLogger(AbstractFaultTolerancePolicy.class);

    protected abstract boolean needPersistence(PhysicalTask task, TaskExecuteResult result);

    @Override
    public void persistence(PhysicalTask task, TaskExecuteResult result) {
        if (task.getContext() == null) {
            logger.error("unexpected task context is null");
            return;
        }
        String key = RowStreamStoreUtils.encodeKey(task.getContext().getId(), task.getOperators().get(0).getSequence());
        if (!needPersistence(task, result)) {
            logger.info("[FaultTolerancePolicy] task result for key = " + key + " doesn't need to persistence!");
            return;
        }
        logger.info("[FaultTolerancePolicy] task result for key = " + key + " need to persistence!");
        RowStreamHolder holder = new RowStreamHolder(result.getRowStream());
        try {
            RowStreamStoreUtils.storeRowStream(key, holder);
            result.setRowStream(holder.getStream());
        } catch (PhysicalException e) {
            e.printStackTrace();
            logger.error("[FaultTolerancePolicy] persist task result failure: ", e);
        }
        logger.info("[FaultTolerancePolicy] task result for key = " + key + " persistence finished!");
    }
}
