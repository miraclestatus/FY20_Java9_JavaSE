package com.neusoft.day11.classMember;

/**
 * @author Eric Lee
 * @date 2020/7/25 11:43
 */
public class Weapon {
    String name;
    int hurt; // 伤害

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
