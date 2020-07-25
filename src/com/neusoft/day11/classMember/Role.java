package com.neusoft.day11.classMember;

/**
 * @author Eric Lee
 * @date 2020/7/25 11:42
 */
public class Role {
    int id ;
    int blood ; // 生命值
    String name;
    // 添加武器属性
    Weapon wp;
    // 盔甲
    Armour ar;

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }


    // 攻击
    public void attack(){
        System.out.println("使用"+ wp.getName() + "， 造成了" + wp.getHurt()+"点伤害");

    }

    // 防御
    public void  wear(){
        // 增加防御
        this.blood += ar.getProtect();
        System.out.println("穿上了" + ar.getName()+", 生命值增加了" + ar.getProtect());


    }



}
