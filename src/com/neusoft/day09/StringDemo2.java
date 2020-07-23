package com.neusoft.day09;

/**
 * @author Eric Lee
 * @date 2020/7/23 16:45
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "helloworld";
        // 获取字符串的长度
        System.out.println(s.length());
        System.out.println("++++++++++++++++++++++++++");
        // 将指定的字符串连接到该字符串的末尾
        String s2 = s.concat("**haha");
        System.out.println(s2);
        System.out.println("++++++++++++++++++++++++++");
        // 获取指定索引的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("++++++++++++++++++++++++++");
        // 返回目标第一次出现的索引, 没有返回-1
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf("a"));
        System.out.println("++++++++++++++++++++++++++");
        // 从start开始 截取字符串到字符串结尾的值
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("++++++++++++++++++++++++++");
        // 从start开始到end结束的截取， 左闭右开
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(3, 8)); // lowor



    }
}
