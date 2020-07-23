package com.neusoft.day09.zuoye1;

/**
 * @author Eric Lee
 * @date 2020/7/23 14:31
 */
public class C extends B {
    int numc =  30;

    @Override
    public void showB() {
        System.out.println("numb"+ numb);
    }

    @Override
    public void showA() {
        System.out.println("numa"+numa);
    }

    public void showC() {
        System.out.println("numc"+numc);
    }

}
