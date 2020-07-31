package com.neusoft.day16;

import com.neusoft.day16.singletonlanhandemo.Singleton;

import java.util.Calendar;

/**
 * @author Eric Lee
 * @date 2020/7/31 09:03
 */
public class Test {
    public static void main(String[] args) {
//        new Singleton()
        Singleton instance = Singleton.getInstance();

        Calendar.getInstance();


    }
}
