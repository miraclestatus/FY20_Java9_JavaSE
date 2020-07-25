package com.neusoft.day11.classMember;

/**
 * @author Eric Lee
 * @date 2020/7/25 14:13
 */
public class Test {
    public static void main(String[] args) {

        Weapon wp = new Weapon("98k", 9999);

        Armour ar = new Armour("一级头", 200);
        Role role = new Role();
        // 设置武器
        role.setWp(wp);
        // 设置防御
        role.setAr(ar);
        // 攻击
        role.attack();

        role.wear();





    }
}
