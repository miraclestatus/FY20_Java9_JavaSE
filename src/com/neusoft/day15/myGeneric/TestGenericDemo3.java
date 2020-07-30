package com.neusoft.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/7/30 09:49
 */
public class TestGenericDemo3 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        getElement(list1);
        getElement(list2);
    }
    public static void getElement(Collection<?> coll){
        // <?>代表可以接受任意类型
    }
}
