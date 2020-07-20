package com.neusoft.day06;

/**
 * @author Eric Lee
 * @date 2020/7/20 09:27
 */
public class Demo1 {
    public static void main(String[] args) {
        // 求给定两个数的最大值的方法
       int  res = max(5, 3);
        System.out.println(res);
        System.out.println(getSum(100));
    }

    public static int max(int num1, int num2){
        if (num1 > num2)
            return num1;
        else
            return num2;

    }
    // 求 1 ~ num的累加和
    public static int getSum(int num){
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
            // return i;
        }
        return sum;
    }

}
