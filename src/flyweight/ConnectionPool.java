package flyweight;

import java.sql.Connection;
import java.util.Vector;

/**
 * @ClassName ConnectionPool
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/9 17:55
 * @Version 1.0
 **/
public class ConnectionPool {

    private Vector<Connection> pool;

    private String username;

    private String password;

    private String url;

    private String driverClassName;

    private int poolSize = 100;

    private static ConnectionPool instance = null;

}
