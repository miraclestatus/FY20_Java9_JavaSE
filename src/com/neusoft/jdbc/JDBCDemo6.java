package com.neusoft.jdbc;

import java.sql.*;

/**
 * @author Eric Lee
 * @date 2020/8/5 09:22
 */
public class JDBCDemo6 {
    // 查询
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");

            String sql = "select * from account;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);


          while (rs.next()){

              int id = rs.getInt(1);
              String name = rs.getString("name");
              int balance = rs.getInt(3);
              System.out.println("id" + id + "name" + name + "balance" + balance);
          }



        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 释放资源

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

    }
    }
