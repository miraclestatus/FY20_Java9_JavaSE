package com.neusoft.day07;

/**
 * @author Eric Lee
 * @date 2020/7/21 15:10
 */
public class Phone {
    String brand;
    int price;
    String color;

    public void callPhone(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
