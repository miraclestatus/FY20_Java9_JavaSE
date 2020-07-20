package com.neusoft.day06;

/**
 * @author Eric Lee
 * @date 2020/7/20 09:54
 */
public class Demo2 {
    public static void main(String[] args) {
        //给一个数组 ， 求数组中最大的元素（使用方法）
        // 创造一个数组
        int[] arrDemo = {1, 2, 100, 4, 5, 6}; // 枚举
        // 我要把arr当做参数， 传给arrayMax()
        //调用求数组最大的函数 arrayMax()
        int max = arrayMax(arrDemo);
        System.out.println(max);
    }
        //  arrayMax()
        public static int  arrayMax(int[] arr){
            //  先定义一个变量max, 假定第一个值是最大的
            int max = arr[0];
            // 遍历数组
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max){
                    // 更新max 的值
                    max = arr[i];
                }
            }
            return max;
    }

}
