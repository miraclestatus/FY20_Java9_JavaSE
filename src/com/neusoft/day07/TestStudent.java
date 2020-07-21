package com.neusoft.day07;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/21 14:38
 */
public class TestStudent {
    public static void main(String[] args) {
        // 类名 对象名 = new 类名();
        Student student = new Student("李莹", 18);
        Student s2 = new Student();


        // com.neusoft.day07.Student@1b6d3586
        // 对象如果没有处理，打印出来的格式
        // 包名 .类名 @ 内存地址
        System.out.println(student);
        // 访问类中的成员
//        System.out.println(student.name); //null
//        System.out.println(student.age); // 0
//        // 给成员变量赋值
//        student.name = "李建军";
//        student.age = 20;
//        student.age = 18;
//        System.out.println("++++++++++++++");
//
//        System.out.println(student.name); //null
//        System.out.println(student.age); // 0
//        System.out.println(student.getName());
//        student.setName("何子亮");
//        System.out.println(student.getName());

        // 调用方法
        student.eat();
        student.study();
    }
}
