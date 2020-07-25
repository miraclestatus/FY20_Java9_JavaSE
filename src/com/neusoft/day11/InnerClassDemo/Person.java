package com.neusoft.day11.InnerClassDemo;

/**
 * @author Eric Lee
 * @date 2020/7/25 10:24
 */
public class Person {
    private boolean live = true;

    class Heart {
        public void jump() {
            // 内部类可以直接访问外部类成员
            if (live) {
                System.out.println("还有一口气");
            } else {
                System.out.println("挂掉了");
            }
        }
    }

    public boolean isLive(){
        return live;
    }
    public void setLive(boolean live){
        this.live = live;
    }

}
