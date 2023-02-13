package cn.edu.tsinghua.iginx.engine.physical.fault;

import cn.edu.tsinghua.iginx.engine.physical.task.PhysicalTask;
import cn.edu.tsinghua.iginx.engine.physical.task.TaskExecuteResult;
import cn.edu.tsinghua.iginx.engine.shared.operator.type.OperatorType;

import java.util.Random;

public class DefaultFaultTolerancePolicy extends AbstractFaultTolerancePolicy {

    private static final Random random = new Random(0);

    private static final DefaultFaultTolerancePolicy instance = new DefaultFaultTolerancePolicy();

    private DefaultFaultTolerancePolicy() {

    }

    @Override
    protected boolean needPersistence(PhysicalTask task, TaskExecuteResult result) {
        return task.getOperators().get(0).getType() != OperatorType.Load && random.nextInt(10) < 3;
    }

    public static FaultTolerancePolicy getInstance() {
        return instance;
    }

}
