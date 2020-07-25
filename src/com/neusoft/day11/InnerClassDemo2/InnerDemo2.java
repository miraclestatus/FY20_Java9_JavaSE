package com.neusoft.day11.InnerClassDemo2;

/**
 * @author Eric Lee
 * @date 2020/7/25 11:14
 */
public class InnerDemo2 {
    public static void main(String[] args) {

        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("嗷嗷飞");
            }
        });

    }

    public static void showFly(FlyAble flyAble){
        flyAble.fly();
    }

}
