package com.neusoft.day13;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/7/28 11:44
 */
public class BaoZhuangDemo {
    public static void main(String[] args) {
//        Integer i = new Integer(4); // 基本 ===》 包装
//        int i1 = i.intValue(); // 包装变 基本
        Integer i = 5;// 自动装箱，
        i = i + 5; // 自动拆箱
        int a = 100;
        System.out.println("a的值" + a);

       
    }
}
