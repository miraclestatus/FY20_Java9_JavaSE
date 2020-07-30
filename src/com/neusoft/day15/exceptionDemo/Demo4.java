package com.neusoft.day15.exceptionDemo;

import java.io.FileNotFoundException;

/**
 * @author Eric Lee
 * @date 2020/7/30 14:12
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            read("xiaomiMi.txt");
        } catch (Exception e) {
            // 在try中抛出什么异常，在括号中就捕获什么异常类型
//            e.printStackTrace();
            System.out.println("++++++++");
            System.out.println(e);
        }
        System.out.println("end");
    }
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("xiaomimi.txt")){
            throw new FileNotFoundException("你的文件怎么消失了呢");
        }
    }
}
