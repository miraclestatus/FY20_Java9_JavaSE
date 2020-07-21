package com.neusoft.day07;

/**
 * @author Eric Lee
 * @date 2020/7/21 14:29
 */
public class Student {
    // 建立了一个 Student类
    // 成员变量  ---》 事物的属性

    private String name;
    private  int age;
    Student(){

    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public int  getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }





    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
    // 成员方法  ---》 事物的行为
    public void study(){
        System.out.println("good good study, day day up");
    }
    public void eat(){
        System.out.println("学习饿了得吃饭");
    }
}
