package com.neusoft.studentAdmin;


import com.neusoft.studentAdmin.dao.Impl.StudentDaoImpl;
import com.neusoft.studentAdmin.dao.StudentDao;
import com.neusoft.studentAdmin.domain.Student;

import java.util.List;

public class MainStudent
{
    public static void main(String[] args) {
        System.out.println("-------- 欢迎登录low版学生管理系统---------");

        StudentDao studentDao = new StudentDaoImpl();
        System.out.println("----------学生列表------------------------");
        List<Student> list = studentDao.findAll();
        for (Student s:list){
            System.out.println(s);
        }
        System.out.println("----------保存学生------------------------");
        Student s2 = new Student("王五","男",70,"大连",150);
        studentDao.save(s2);
        List<Student> list1 = studentDao.findAll();
        for (Student s:list1){
            System.out.println(s);
        }
        // new Student
//        studentDao.save();

        // 修改
        System.out.println("----------修改------------------------");
        Student s1 = new Student(1,"李四","男",99,"锦州",139);
        studentDao.update(s1);
        List<Student> list2 = studentDao.findAll();
        for (Student s:list2){
            System.out.println(s);
        }
        // 删除
        System.out.println("----------删除------------------------");
        Student s3 = new Student(3);
        studentDao.remove(s3);
        List<Student> list3 = studentDao.findAll();
        for (Student s:list3){
            System.out.println(s);
        }
    }
}
