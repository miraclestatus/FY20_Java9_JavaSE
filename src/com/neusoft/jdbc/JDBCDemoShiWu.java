package com.neusoft.jdbc;

import com.neusoft.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Eric Lee
 * @date 2020/8/6 14:41
 */
public class JDBCDemoShiWu {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            // 在此处开启事物
            conn.setAutoCommit(false);
            String sql = "update account set balance = balance - ? where id = ? ";
            String sql2 = "update account set balance = balance + ? where id = ? ";
            pstmt = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql2);
            // 设置参数
            pstmt.setInt(1, 500);
            pstmt.setInt(2, 1);

            pstmt2.setInt(1, 500);
            pstmt2.setInt(2, 2);
            int count = pstmt.executeUpdate();

            // 手动制造异常
            int i = 5/0;

            int count2 = pstmt2.executeUpdate();
            System.out.println("count"+ count + "count2"+count2);

            // 提交事物
            conn.commit();
        } catch (Exception e) {
             事物进行回滚
            try {
                if (conn != null){
                    conn.rollback();
                }
            }catch (SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt, conn);
            JDBCUtils.close(pstmt2, conn);
        }
    }
}
