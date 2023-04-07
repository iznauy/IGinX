package cn.edu.tsinghua.iginx.engine.physical.exception;

public class TaskCancelException extends Exception {

    public TaskCancelException() {
        super("Task has been canceled");
    }
}
