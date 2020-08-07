package com.neusoft.studentAdmin.dao.Impl;


import com.neusoft.studentAdmin.dao.StudentDao;
import com.neusoft.studentAdmin.domain.Student;
import com.neusoft.studentAdmin.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    public List<Student> findAll() {
        Connection conn =null;
        Statement stmt =null;
        ResultSet rs =null;
        ArrayList<Student> list=null;
        try{
            conn = JDBCUtils.getConnection();
            String sql="select * from studentmanage";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list=new ArrayList<>();
            while(rs.next()){
                 int id=rs.getInt("id");
                 String name=rs.getString("name");
                 String gender=rs.getString("gender");
                 int score=rs.getInt("score");
                 String addr=rs.getString("addr");
                 int tel=rs.getInt("tel");

                Student student=new Student(id,name,gender,score,addr,tel);
                list.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return list;

    }


    @Override
    public void save(Student student) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        try{
            conn= JDBCUtils.getConnection();
            String sql= "insert into studentmanage values(null,?,?,?,?,?);";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,student.getName());
            pstmt.setString(2, student.getGender());
            pstmt.setInt(3, student.getScore());
            pstmt.setString(4, student.getAddr());
            pstmt.setInt(5, student.getTel());


            int count=pstmt.executeUpdate();
            System.out.println("count"+ count );

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }

    @Override
    public void remove(Student student) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        try{
            conn= JDBCUtils.getConnection();
            String sql= "delete from studentmanage where id=?;";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,student.getId());
            int count=pstmt.executeUpdate();
            System.out.println("count"+ count );

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }

    @Override
    public void update(Student student) {

        Connection conn=null;
        PreparedStatement pstmt=null;
        try{
            conn= JDBCUtils.getConnection();
            String sql= "update studentmanage set name=?, gender =?,  score=?, addr = ?, tel=? where id=?;";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,student.getName());
            pstmt.setString(2, student.getGender());
            pstmt.setInt(3, student.getScore());
            pstmt.setString(4, student.getAddr());
            pstmt.setInt(5, student.getTel());
            pstmt.setInt(6, student.getId());

            int count=pstmt.executeUpdate();
            System.out.println("count"+ count );

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }
}
