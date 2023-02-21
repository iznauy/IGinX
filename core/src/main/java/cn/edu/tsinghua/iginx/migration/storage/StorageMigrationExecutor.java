package cn.edu.tsinghua.iginx.migration.storage;

import cn.edu.tsinghua.iginx.conf.ConfigDescriptor;
import cn.edu.tsinghua.iginx.metadata.DefaultMetaManager;
import cn.edu.tsinghua.iginx.metadata.IMetaManager;
import cn.edu.tsinghua.iginx.migration.MigrationManager;
import cn.edu.tsinghua.iginx.migration.MigrationPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class StorageMigrationExecutor {

    private static final Logger logger = LoggerFactory.getLogger(StorageMigrationExecutor.class);

    private final IMetaManager metaManager;

    private final ThreadPoolExecutor executor;

    private static class MigrationTask implements Callable<Boolean>, Runnable {

        private final ThreadPoolExecutor executor;

        private final IMetaManager metaManager;

        private final long storageId;

        private final boolean migrationData;

        public MigrationTask(ThreadPoolExecutor executor, IMetaManager metaManager, long storageId, boolean migrationData) {
            this.executor = executor;
            this.metaManager = metaManager;
            this.storageId = storageId;
            this.migrationData = migrationData;
        }

        @Override
        public Boolean call() {
            StorageMigrationPlan plan = metaManager.getStorageMigrationPlan(storageId);
            if (plan != null) {
                // 中继查询
                logger.info("this is a replay migration");
            } else {
                plan = MigrationManager.getInstance().getStorageMigration().generateMigrationPlans(storageId, migrationData);
                if (!metaManager.storeMigrationPlan(plan)) {
                    logger.info("storage migration plan " + plan + " failure");
                    return false;
                }
            }

            Map<String, String> storageUnitMigrationMap = metaManager.startMigrationStorageUnits(plan.getMigrationMap());
            List<Callable<Boolean>> tasks = new ArrayList<>();

            for (String sourceStorageUnit: storageUnitMigrationMap.keySet()) {
                String targetStorageUnit = storageUnitMigrationMap.get(sourceStorageUnit);
                MigrationPolicy migrationPolicy = MigrationManager.getInstance().getMigration();
                tasks.add(() -> {
                    if (!migrationPolicy.migrationData(sourceStorageUnit, targetStorageUnit)) {
                        return false;
                    }
                    return metaManager.finishMigrationStorageUnit(sourceStorageUnit, migrationData);
                });
            }

            try {
                List<Future<Boolean>> futures = executor.invokeAll(tasks);
                for(Future<Boolean> future: futures) {
                    Boolean ret = future.get();
                    if (ret == null || !ret) {
                        return false;
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                return false;
            }
            return metaManager.deleteMigrationPlan(storageId);
        }

        @Override
        public void run() {
            call();
        }
    }

    private StorageMigrationExecutor() {
        metaManager = DefaultMetaManager.getInstance();
        executor = new ThreadPoolExecutor(ConfigDescriptor.getInstance().getConfig().getMigrationThreadPoolSize(),
                Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS, new SynchronousQueue<>());
    }

    public static StorageMigrationExecutor getInstance() {
        return StorageMigrationExecutorHolder.INSTANCE;
    }

    public boolean migration(long storageId, boolean sync, boolean migrationData) {
        MigrationTask task = new MigrationTask(executor, metaManager, storageId, migrationData);
        if (sync) {
            return Boolean.TRUE.equals(task.call());
        }
        executor.execute(task);
        return true;
    }

    private static class StorageMigrationExecutorHolder {

        private static final StorageMigrationExecutor INSTANCE = new StorageMigrationExecutor();

        private StorageMigrationExecutorHolder() {
        }

    }

}
