package com.neusoft.day15.lambdaDemo;

/**
 * @author Eric Lee
 * @date 2020/7/30 14:37
 */
public class Demo2 {
    public static void main(String[] args) {
        invoke(()->{
            System.out.println("lambda表达式做的饭好了");
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
