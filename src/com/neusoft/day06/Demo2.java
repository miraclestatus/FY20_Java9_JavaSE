package com.neusoft.day06;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/7/20 09:54
 */
public class Demo2 {
    public static void main(String[] args) {
        //给一个数组 ， 求数组中最大的元素（使用方法）
        // 创造一个数组
        int[] arrDemo = {22, 2, 100, 4, 5, 6}; // 枚举
        // 我要把arr当做参数， 传给arrayMax()
        //调用求数组最大的函数 arrayMax()
//        int max = arrayMax(arrDemo);
//        System.out.println(max);
         // 将数组反转
//        for (初始表达式; 结束(布尔)表达式 ; 步进表达式) {
//
//        }

        // 调用方法
        int[] newArr = arrayReverse(arrDemo);
//        System.out.println(Arrays.toString(arrDemo));
        // 编写一个方法 printArray 打印数组的显示 [6, 5, 4, 100, 2, 22]
//        System.out.println(newArr);
        System.out.println(printArray(arrDemo));
    }
        //  arrayMax()
        public static int  arrayMax(int[] arr){
            //  先定义一个变量max, 假定第一个值是最大的
            int max = arr[0];
            // 遍历数组
            for (int i = 0; i <= arr.length-1; i++) {
                if (arr[i] > max){
                    // 更新max 的值
                    max = arr[i];
                }
            }
            return max;
    }
        public static int[] arrayReverse(int[] arr){
            for (int min = 0, max = arr.length-1;  min<=max ; min++, max--) {
                int temp = arr[min];
                arr[min] = arr[max];
                arr[max] = temp;
            }
            return arr;
        }
        public static String printArray(int[] arr){
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length-1){
                    // 数组的最后一个
                    // arr[i] + "] " + " "
                    str += arr[i] + "]";
                }else {
                    // arr[i] + ", " + " "
                    str += arr[i] + ", " + " ";
                }
            }
            return str;
        }



}
