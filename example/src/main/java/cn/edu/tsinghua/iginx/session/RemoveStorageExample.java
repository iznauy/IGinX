package cn.edu.tsinghua.iginx.session;

public class RemoveStorageExample {

    public static void main(String[] args) throws Exception {
        Session session = new Session("127.0.0.1", 6888);
        session.openSession();

        session.removeStorage(1L);

        session.closeSession();
    }

}
