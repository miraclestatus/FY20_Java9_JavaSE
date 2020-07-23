package com.neusoft.day09.mianshi;

/**
 * @author Eric Lee
 * @date 2020/7/23 14:09
 */
public class Zi  extends  Fu{

    public int num  = 20;

    public Zi() {
        System.out.println("Zi");
    }
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
