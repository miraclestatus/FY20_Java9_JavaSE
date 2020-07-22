package com.neusoft.day08;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/7/22 08:44
 */
public class Demo1 {
    public static void main(String[] args) {
        // 班级来了3个学生
        Student[] students = new Student[3];
            //   int[] arr = new int[4];
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 12);
        Student s3 = new Student("王五", 13);
        // 对象存入数组
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        //
//        System.out.println(Arrays.toString(students));
        for (int i = 0; i < students.length; i++) {
           Student s =  students[i];
            System.out.println(s.getName()+"---->"+ s.getAge());
        }
        // 存储对象，目前只能选择数组
        // 数组长度是固定， 无动态扩容
        // java.util.ArrayList 集合类，更方便
    }
}
