package cn.edu.tsinghua.iginx.iotdb;

import cn.edu.tsinghua.iginx.engine.physical.storage.fault_tolerance.Connector;
import org.apache.iotdb.rpc.IoTDBConnectionException;
import org.apache.iotdb.rpc.StatementExecutionException;
import org.apache.iotdb.session.Session;
import org.apache.iotdb.session.SessionDataSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class IoTDBConnector implements Connector {

    private static final Logger logger = LoggerFactory.getLogger(IoTDBConnector.class);

    private static final ExecutorService service = Executors.newSingleThreadExecutor();

    private Session session;

    public IoTDBConnector(String ip, int port, String username, String password) {
        this.session = new Session(ip, port, username, password);
    }

    @Override
    public boolean echo(long timeout, TimeUnit unit) {
        Future<Boolean> future = service.submit(() -> {
            try {
                session.open();
                SessionDataSet dataSet = session.executeQueryStatement("show version");
                dataSet.closeOperationHandle();
                session.close();
            } catch (IoTDBConnectionException e) {
                logger.error("connect to iotdb error: " + e.getMessage());
                return false;
            } catch (StatementExecutionException e) {
                logger.error("execute statement error: " + e.getMessage());
            }
            return true;
        });
        try {
            return future.get(timeout, unit);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            future.cancel(true);
            logger.error("connection timeout: ", e);
        }
        return false;
    }

    @Override
    public void reset() {
        this.session = null;
    }

}
