package com.neusoft.day10.interfaceDemo;

/**
 * @author Eric Lee
 * @date 2020/7/24 14:34
 */
public class Animal implements LiveAble {
    // 无法重写静态方法
    @Override
    public void eat() {
        System.out.println("就知道吃");
    }

    @Override
    public void sleep() {
        System.out.println("还睡呀");
    }

//    @Override
//    public void fly() {
//        System.out.println("左右飞");
//    }
}
