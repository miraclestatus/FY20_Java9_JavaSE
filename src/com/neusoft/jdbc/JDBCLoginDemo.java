package com.neusoft.jdbc;

import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/8/6 11:05
 */
public class JDBCLoginDemo {
    public static void main(String[] args) {
        // 键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String userName = sc.nextLine();
        System.out.println("请输入您的密码");
        String password = sc.nextLine();
        // 编写一个方法 login 判断用户用户名和密码是否正确
//        boolean flag = new JDBCLoginDemo().login(userName, password);
        boolean flag = new JDBCLoginDemo().login2(userName, password);
        if (flag){
            System.out.println("登录成功！");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    public boolean login(String userName, String password){
        // 判断是否为空
        if (userName == null || password ==null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            // sql
            String sql = "select * from user where username = '"+userName+"' and password= '"+password+"'";
//            StringBuilder sql2 = new StringBuilder("select * from user where username = '")
//                    .append(userName).append("' and password= '").append(password).append("'");

            System.out.println(sql);
//            System.out.println(sql2);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next(); // 如果有下一行， 就返回true


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt, conn, rs);
        }

        return false;

    }
    public boolean login2(String userName, String password){
        // 判断是否为空
        if (userName == null || password ==null){
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            // sql
            String sql = "select * from user where username = ? and password= ?";
            System.out.println(sql);
            // 先获执行sql 的对象PreparedStatement
            pstmt = conn.prepareStatement(sql);
            // 给? 赋值
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            // 执行查询 不需要传递sql
            rs = pstmt.executeQuery();
//            if (rs.next()){
//                return true;
//            }else {
//                return false;
//            }
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt, conn, rs);
        }

        return false;

    }

}
