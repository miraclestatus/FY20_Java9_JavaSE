package com.neusoft.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/4 16:59
 */
public class JDBCDemo2 {
    public static void main(String[] args) throws Exception {
//        3、获取数据库连接对象 Connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java9", "root", "root");
//        4、定义sql
//        String sql = "update account set balance= 20000 where id = 3";
        String sql = "insert  into account values (null , '王五', 1000)";
//        5、获取执行sql语句的对象 Statement
        Statement stmt = conn.createStatement();
//        6、执行sql，接受返回结果
        int count = stmt.executeUpdate(sql);// 返回受影响的行数
//        7、处理结果
        if(count > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

//        8、释放资源
        stmt.close();
        conn.close();
    }
}
