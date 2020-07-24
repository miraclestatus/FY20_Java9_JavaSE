package com.neusoft.day10.interfaceDemo;

/**
 * @author Eric Lee
 * @date 2020/7/24 14:36
 */
public class TestInterface {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.fly(); // 调用默认方法
        LiveAble.run();
    }
}
