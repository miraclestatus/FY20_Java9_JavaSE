package com.neusoft.day08;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/7/22 09:10
 */
public class Demo2 {
    public static void main(String[] args) {
        // ArrayList
//        ArrayList<String> list = new ArrayList<>();
//        list.add("鲁班七号");
//        list.add("安琪拉");
//        list.add("铠");
//        // ArrayList 可以直接打印
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
//          int  number = random.nextInt(100);
//          list.add(number);
            list.add(random.nextInt(100));
        }

        System.out.println(list);
    }
}
