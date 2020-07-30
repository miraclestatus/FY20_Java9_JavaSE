package com.neusoft.day15.myGeneric;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/30 09:37
 */
public class TestGenericDemo2 {
    public static void main(String[] args) {
        MyGenericImpl2<String> impl2 = new MyGenericImpl2<>();
        ArrayList<Object> list = new ArrayList<>();
        impl2.add("hehe");

    }
}
