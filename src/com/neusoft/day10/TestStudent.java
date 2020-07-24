package com.neusoft.day10;

/**
 * @author Eric Lee
 * @date 2020/7/24 09:30
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("孙力宏", 22);
        Student s2 = new Student("黄一峰", 18);
        Student s3 = new Student("李建军", 18);
        Student s4 = new Student("李建军", 18);
        s1.show();
        s2.show();
        s3.show();
        s4.show();

    }
}
