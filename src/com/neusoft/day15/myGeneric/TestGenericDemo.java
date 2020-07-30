package com.neusoft.day15.myGeneric;

/**
 * @author Eric Lee
 * @date 2020/7/30 09:07
 */
public class TestGenericDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String类
        MyGenericClass<String> my = new MyGenericClass<>();
        my.setMvp("哈登哥");
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(13);
        Integer mvp2 = my2.getMvp();
        System.out.println(mvp2);


    }
}
