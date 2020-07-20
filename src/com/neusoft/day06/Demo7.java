package com.neusoft.day06;

import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/7/20 15:37
 */
public class Demo7 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <100 ; i++) {
            // 0 ~ bound 之间的随机整数 ，左闭右开
            int num = r.nextInt(5);
            System.out.print(num);

        }
//        get Num(num)
    }
}
