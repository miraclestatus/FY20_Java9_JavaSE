package com.neusoft.day09;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/23 17:11
 */
public class StringAI {
    public static void main(String[] args) {
        // 价值一个亿的ai核心代码
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true){
            str = scanner.next();
            str = str.replace("吗", "");
            str = str.replace("?", "!");
            System.out.println(str);
        }


    }
}
