package com.neusoft.day09;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/7/23 17:06
 */
public class StringDemo4 {
    public static void main(String[] args) {
//        String s = "1131225468@qq.com";
        String s = "aa/bb/cc";
//        String[] strings = s.split("@");
        String[] strings = s.split("/");
        System.out.println(Arrays.toString(strings));
    }
}
