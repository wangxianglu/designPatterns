package flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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

    Connection conn = null;


    // 构造方法 初始化部分属性
    public ConnectionPool() {
        pool = new Vector<>();
        for(int i =0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /* 返回连接到连接池 */
    public synchronized void release() {
        pool.add(conn);
    }

    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }

}
