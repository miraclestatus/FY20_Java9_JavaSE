package com.neusoft.day10;

/**
 * @author Eric Lee
 * @date 2020/7/24 09:26
 */
public class Student {
    private String name;
    private int age;
    // 学号
    private int sid;
    // 类变量， 记录学生数量
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }
    public void show(){
        System.out.println("学员 ：name = "+ name+", age= "+age + " sid = "+sid);
    }
}
