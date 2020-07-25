package com.neusoft.day11.interfaceDemo;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/25 14:37
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        ArrayList<Integer> doubleNumList = getDoubleNum(list);
        System.out.println(doubleNumList);

    }


    public static  ArrayList<Integer> getDoubleNum(ArrayList<Integer> list){
        ArrayList<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                doubleList.add(list.get(i));
        }
        return doubleList;
    }
}
