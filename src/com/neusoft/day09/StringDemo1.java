package com.neusoft.day09;

/**
 * @author Eric Lee
 * @date 2020/7/23 15:29
 */
public class StringDemo1 {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = "HELLO";
//        //将此 String 与另一个 String 比较
//        System.out.println(s1.equals(s2));// true
//        System.out.println(s1.equals(s3));// false
//        // 将此 String 与另一个 String 比较，不考虑大小写。
//        System.out.println(s1.equalsIgnoreCase(s2)); // true
//        System.out.println(s1.equalsIgnoreCase(s3)); // true
//
//        System.out.println(s1 == s2); //
//        System.out.println(s1 == s3);
//        int i = 2;
//        int k = 2;
//        char m  = '2';
//        System.out.println(i == k); // true
//        System.out.println(m == k); // false
//        Object obj1 = new Object();
////        Object obj2 = new Object();
////        //  都是比较的地址值
////        System.out.println(obj1.equals(obj2)); // false
////
////        System.out.println(obj1==obj2); // false

        String a = new String("abcd");
        String b = new String("abcd");
        // abcd 放在常量池中
        String c = "abcd";
        String d = "abcd";

        if (a == b){ // false
            // 不是同一个对象
            System.out.println("a==b");
        }
        if (a.equals(b)){
            // true String 重写了equals
            System.out.println("a==b equals");
        }
        if (c == d){
            // true 共享同一变量
            System.out.println("c==d");
        }
        if (c.equals(d)){
            System.out.println("c.equals(d)");
        }


    }
}
