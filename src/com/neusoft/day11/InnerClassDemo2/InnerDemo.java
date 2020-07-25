package com.neusoft.day11.InnerClassDemo2;

/**
 * @author Eric Lee
 * @date 2020/7/25 11:14
 */
public class InnerDemo {
    public static void main(String[] args) {
//        Bat bat = new Bat();
//        bat.fly();
        /**
         * 等号左边
         * 等号右边
         */

        FlyAble f  =  new FlyAble() {
            @Override
            public void fly() {
                System.out.println("嗷嗷飞");
            }
        };
        System.out.println(f);
        f.fly();


    }
}
