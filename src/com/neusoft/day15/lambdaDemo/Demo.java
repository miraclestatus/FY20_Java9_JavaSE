package com.neusoft.day15.lambdaDemo;

/**
 * @author Eric Lee
 * @date 2020/7/30 14:47
 */
public class Demo {
    public static void main(String[] args) {
        Cook cook = new CookImpl();
        invoke(cook);
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
