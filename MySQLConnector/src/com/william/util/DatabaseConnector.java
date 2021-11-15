package com.william.util;

import com.william.interfaces.MyDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 此类是一个工具类，用于辅助与MySQL进行连接。连接通过JDBC实现，使用了MYSQL 8.0.26版本的驱动器。
 *
 * @author WilliamLi
 * @version 1.0
 * @date 10/10/2021 下午6:20
 */
public class DatabaseConnector {

    /**
     * 数据库javabean对象。
     */
    private final MyDataBase dataBase;

    /**
     * 驱动程序信息。
     */
    private String driver;

    /**
     * 数据库URL链接。
     */
    private String url;

    /**
     * 数据库用户名。
     */
    private String user;

    /**
     * 数据库密码。
     */
    private String password;

    /**
     * 有参数构造方法，创建对象的时候传入MyDataBase的具体实现类对象。
     *
     * @param myDataBase MyDataBase结构的具体实现类对象。
     */
    public DatabaseConnector(MyDataBase myDataBase) {
        this.dataBase = myDataBase;
        init();
    }

    /**
     * 此方法用于初始化数据库信息。
     */
    private void init() {
        this.driver = this.dataBase.getDriver();
        this.url = this.dataBase.getUrl();
        this.user = this.dataBase.getUser();
        this.password = this.dataBase.getPassword();
    }

    /**
     * 此方法用于建立数据库连接，方法返回一个java.sql.Connection对象。
     *
     * @return 连接成功的java.sql.Connection对象。
     * @throws ClassNotFoundException 驱动建立失败时抛出ClassNotFoundException。
     * @throws SQLException           建立链接时可能产生SQL异常。
     * @see java.sql.DriverManager
     */
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
