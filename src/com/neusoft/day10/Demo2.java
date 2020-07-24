package com.neusoft.day10;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/24 08:54
 */
public class Demo2 {
    public static void main(String[] args) {
        // 键盘录入一个字符串数据， 统计出大写字母， 小写字母， 数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据");
        String s = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < s.length(); i++) {
           char ch =  s.charAt(i);
           // 对每个字符进行判断
            if (ch >= 'A'&& ch <='Z'){
                bigCount++;
            }else if (ch >= 'a'&& ch <='z'){
                smallCount++;
            }else if(ch >= '0'&& ch <='9'){
                numberCount++;
            }else {
                System.out.println("该字符非法");
            }
//
//            if (ch >= 65 && ch <=90){
//                bigCount++;
//            }else if (ch >= 97&& ch <=122){
//                smallCount++;
//            }else if(ch >= 48&& ch <=57){
//                numberCount++;
//            }else {
//                System.out.println("该字符非法");
//            }
        }
        System.out.println("大写字符数"+ bigCount);
        System.out.println("小写字符数"+ smallCount);
        System.out.println("数字字符数"+ numberCount);





    }

}
