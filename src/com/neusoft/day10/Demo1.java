package com.neusoft.day10;

/**
 * @author Eric Lee
 * @date 2020/7/24 08:37
 */
public class Demo1 {
    public static void main(String[] args) {
        //  {1, 2, 3} === > [1#2#3]  , [1, 2, 3]
        int[] arr ={1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);

    }
    public static String arrayToString(int[] arr){
        String s = new String("[");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
           if(i == arr.length-1){
               s = s.concat(arr[i] + "]");
           }else {
//               s = s.concat(arr[i] + "#");
               s = s.concat(arr[i] + ",");
           }
        }
        return s;
    }
}
