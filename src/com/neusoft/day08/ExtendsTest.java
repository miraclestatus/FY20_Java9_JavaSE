package com.neusoft.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 11:01
 * 继承
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "小明";
        t.level = "15级";
        t.printName();
        t.work();
        t.show();
    }
}
