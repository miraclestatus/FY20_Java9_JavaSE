package com.neusoft.day10;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/24 09:57
 */
public class Game {
    public static int number;
    public static ArrayList<String> list;
    // 作用，给类变量进行初始化赋值
    static {
        number = 2;
        list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");

    }
}
