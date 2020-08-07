package com.neusoft.jdbc.studentAdmin.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Eric Lee
 * @date 2020/8/6 09:54
 */
public class JDBCUtils {
    private static DataSource ds;

    static {
        Properties properties = new Properties();
        try {
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 连接
    public  static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    // close
    public static void close(Statement stmt, Connection conn, ResultSet rs){

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static void close(Statement stmt, Connection conn){

      close(stmt, conn, null);

    }

    //


    public static DataSource getDs() {
        return ds;
    }
}


