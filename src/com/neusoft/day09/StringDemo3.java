package com.neusoft.day09;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author Eric Lee
 * @date 2020/7/23 16:58
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s = "helloworld";
        //  转化为字符数组
        char[] chars =  s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //  转化为字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }
        // 替换
        s = s.replace('h', 'H');
        System.out.println(s);
        s = s.replace("wo", "WO");
        System.out.println(s);
    }
}
