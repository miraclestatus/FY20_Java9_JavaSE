package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/8/5 09:07
 */
public class JDBCDemo3 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
        try {

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "insert  into account values (null , '赵六', 1000)";
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);// 返回受影响的行数

            if(count > 0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }

        }catch ( ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            // 释放资源

            if (stmt != null){
                try {
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if (conn != null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }


        }







    }
}
