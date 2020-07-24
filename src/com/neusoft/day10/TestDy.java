package com.neusoft.day10;

/**
 * @author Eric Lee
 * @date 2020/7/24 11:11
 */
public class TestDy {
    public static void main(String[] args) {
        // 使用多态方式
       Animal a1 =  new Cat();
       // 执行的是子类重写后方法
       a1.eat();
       Animal a2 = new Dog();
       a2.eat();

    }
}
