package com.neusoft.day10.computerDemo;

/**
 * @author Eric Lee
 * @date 2020/7/24 16:25
 */
public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("鼠标开启， 小灯一闪");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭， 小灯一灭");
    }

    public void click() {
        System.out.println("鼠标单击");
    }

}
