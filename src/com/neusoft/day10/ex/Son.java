package com.neusoft.day10.ex;

/**
 * @author Eric Lee
 * @date 2020/7/25 12:41
 */
public class Son extends  Father{
    int x = 2;

    public Son() {
        System.out.println("Son");
    }
    public Son(String s) {
        System.out.println("Son" + s);
    }
}
