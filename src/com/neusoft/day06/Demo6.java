package com.neusoft.day06;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/20 15:26
 */
public class Demo6 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
        int i = new Scanner(System.in).nextInt();
        // 匿名对象作为方法的参数
        input(new Scanner(System.in));

        // 匿名对象作为方法返回值

    }
    public static void input(Scanner sc){

        System.out.println(sc);
    }

    public static Scanner getScanner(){
        // 普通方式
//        Scanner scanner = new Scanner(System.in);
//        return scanner;
        return new Scanner(System.in);

    }
}
