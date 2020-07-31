package com.neusoft.day16.singletonerhandemo;

/**
 * @author Eric Lee
 * @date 2020/7/31 08:57
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){};


    public static Singleton getInstance(){
        return instance;
    }
}
