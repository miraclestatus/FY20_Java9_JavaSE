package com.neusoft.day10.ex;

/**
 * @author Eric Lee
 * @date 2020/7/25 12:42
 */
public class Test {
    public static void main(String[] args) {
        Father f = new Son("hello");
        System.out.println(f.x);
    }
}
