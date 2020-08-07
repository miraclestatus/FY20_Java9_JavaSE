package com.neusoft.studentAdmin.dao;



import com.neusoft.studentAdmin.domain.Student;

import java.util.List;

public interface StudentDao
{
        // 学生列表 查询所有学生
        public List<Student> findAll();
        //  保存某个学生
        public void save(Student student);
        //  删除某个学生
        public void remove(Student student);
        //  修改某个学生
        public void update(Student student);
}
