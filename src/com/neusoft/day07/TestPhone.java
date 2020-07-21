package com.neusoft.day07;

/**
 * @author Eric Lee
 * @date 2020/7/21 15:11
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.callPhone("码云");
        phone.sendMessage();
    }
}
