package com.neusoft.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/7/30 09:59
 */
public class TestGenericDemo4 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();
//        getElement1(list1);
//        getElement1(list2);// 报错
//        getElement1(list3);
//        getElement1(list4); // 报错
//
//        getElement2(list1)// 报错
//        getElement2(list2)// 报错
//        getElement2(list3)// 报错
//        getElement2(list4)// 报错
    }
    // 泛型的上限 此时泛型？必须是Number类型或者Number类型子类
    public static void getElement1(Collection<? extends Number> coll){
    }
    // 泛型的下限 此时泛型？必须是Number类型或者Number类型父类
    public static void getElement2(Collection<? super Number> coll){
    }
}
