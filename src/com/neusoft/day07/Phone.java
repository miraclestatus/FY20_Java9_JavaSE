package com.neusoft.day07;

/**
 * @author Eric Lee
 * @date 2020/7/21 15:10
 */
public class Phone {
    private String brand;
    private int price;
    private String color;
    public void callPhone(String name) {
        int callTime = 90;
        System.out.println("给" + name + "打电话, 打了"+ callTime+"分钟");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void sendMessage() {
        System.out.println("群发短信");
    }
}
