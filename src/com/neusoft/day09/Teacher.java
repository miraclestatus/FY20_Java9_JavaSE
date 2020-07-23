package com.neusoft.day09;

import com.neusoft.day09.Employee;

/**
 * @author Eric Lee
 * @date 2020/7/22 11:13
 */
public class Teacher extends Employee{
    String level;
    int num = 6;

    public Teacher() {
        super(); // 调用父类的构造方法
        System.out.println("Teacher构造函数被调用");
    }




    public void printName(){
        System.out.println("name" + name);
    }
    public void show(){
        System.out.println("Fu = " + super.num);
        System.out.println("Zi = " + this.num);
    }
    @Override
    public void work(){
        System.out.println("高效率的卖力干活");
    }
}
