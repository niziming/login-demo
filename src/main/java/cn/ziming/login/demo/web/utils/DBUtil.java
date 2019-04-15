package cn.ziming.login.demo.web.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBUtil {
    public static String driver;
    public static String url;
    public static String user;
    public static String pwd;

    static {
        try{
            InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            // 配置
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            pwd = properties.getProperty("pwd");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConn() throws Exception{
        // 三大组件
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        // 加载驱动
        Class.forName(driver);

        // 建立连接
        connection = DriverManager.getConnection(url, user, pwd);

        return connection;
    }
}
