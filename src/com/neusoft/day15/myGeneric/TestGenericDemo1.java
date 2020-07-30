package com.neusoft.day15.myGeneric;

/**
 * @author Eric Lee
 * @date 2020/7/30 09:21
 */
public class TestGenericDemo1 {
    public static void main(String[] args) {
        MyGenericMethod mgm = new MyGenericMethod();
        // 在调用方法时， 确定泛型的类型
        mgm.show("aaa");
        mgm.show(123);
        mgm.show(12.45);

    }
}
