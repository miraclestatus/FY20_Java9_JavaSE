package com.neusoft.day10;

/**
 * @author Eric Lee
 * @date 2020/7/24 10:19
 */
public class Demo4 {
    public static void main(String[] args) {
//        double d1 = Math.abs(-5); // 绝对值
//        System.out.println(d1);
//        double d2 = Math.ceil(-3.3); //返回大于等于参数的最小整数
//        System.out.println(d2);
//        double d3 = Math.floor(-3.3);
//        System.out.println(d3); // 返回小于等于参数的最小整数
//        double d4 = Math.round(5.5); // 四舍五入
//        System.out.println(d4);
        // 计算 -10.8 到 5.9 之间， 绝对值大于 6小于2.1 的整数有多少个
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (double i = Math.ceil(min); i <= Math.floor(max) ; i++) {
            if(Math.abs(i) >6 || Math.abs(i) < 2.1){
                count++;
                System.out.println(i);
            }
        }

        System.out.println("个数为"+ count);
    }
}
