package com.neusoft.day06;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/20 14:56
 */
public class Demo5 {
    public static void main(String[] args) {
        // sanner 类
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println("i"+i);\
//        在键盘中输入三个数据， 输出最大那个
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a = scanner.nextInt();
        System.out.println("请输入第二个值");
        int b = scanner.nextInt();
        System.out.println("请输入第三个值");
        int c = scanner.nextInt();

        //  x ? y : z
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);
        System.out.println("max = "+max);

    }
}
