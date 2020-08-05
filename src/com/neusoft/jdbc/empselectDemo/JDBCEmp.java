package com.neusoft.jdbc.empselectDemo;

import com.neusoft.jdbc.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/8/5 09:48
 */
public class JDBCEmp {
    public static void main(String[] args) {
        // 定义一个方法 查询emp表中所有的数据
        new JDBCEmp().findAll();
//        findAll();
    }

    public List<Emp> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp>  list = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");

            String sql = "select * from account;";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);

            list = new ArrayList<>();

            while (rs.next()) {
                // TODO


                Emp emp = new Emp();
               list.add(emp);
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
        return list;
    }
}
