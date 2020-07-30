package com.neusoft.day15.lambdaDemo;

/**
 * @author Eric Lee
 * @date 2020/7/30 14:49
 */
public class CookImpl implements Cook {

    @Override
    public void makeFood() {
        System.out.println("CookImpl做的饭");
    }
}
