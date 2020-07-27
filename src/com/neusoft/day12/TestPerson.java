package com.neusoft.day12;

/**
 * @author Eric Lee
 * @date 2020/7/27 14:08
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 111);
        Person p2 = new Person("张三", 111);
        Person p3 = new Person("李四", 111);
        // com.neusoft.day12.Person@75412c2f
        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
