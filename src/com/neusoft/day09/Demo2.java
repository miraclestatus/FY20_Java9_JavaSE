package com.neusoft.day09;

/**
 * @author Eric Lee
 * @date 2020/7/23 14:52
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "haha";
        // 等效于
//        char[] data = {'h', 'a','h', 'a'};
        char data[] = {'h', 'a','h', 'a'};

        String s = new String(data);
        System.out.println(s);
        String str3 = "haha";
        // 由于不可变， 内存在只有一个"haha"对象被创建 同时被str和str3共享

//        str +=  "d";
        String str2 = str + "d";

        byte bytes[] = {97, 98, 99};
        String s2 = new String(bytes);
        System.out.println("s2"+s2);


        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
//        new String()





    }
}
