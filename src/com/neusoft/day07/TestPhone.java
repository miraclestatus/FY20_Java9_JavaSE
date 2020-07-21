package com.neusoft.day07;

/**
 * @author Eric Lee
 * @date 2020/7/21 15:11
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
//        phone.brand = "华为";
        phone1.setBrand("huawei");
        System.out.println(phone1.getBrand());
        phone1.callPhone("码云");
        phone1.sendMessage();

    }
}
