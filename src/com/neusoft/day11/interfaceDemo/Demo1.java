package com.neusoft.day11.interfaceDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/7/25 14:37
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> doubleNumList = getDoubleNum(list);
        System.out.println(doubleNumList);
    }


    public static  List<Integer> getDoubleNum(List<Integer> list){
        List<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                doubleList.add(list.get(i));
        }
        return doubleList;
    }
}
