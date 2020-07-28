package com.neusoft.day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/7/28 16:08
 */
public class TestForEach {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8};
        for (int  a: arr){
            System.out.println(a);
        }
        Collection<String> coll = new ArrayList<>();
        coll.add("小鲁班");
        coll.add("后羿");
        coll.add("安琪拉");
        for(String hero :coll){
            System.out.println("当前英雄是"+hero);
        }
    }
}
