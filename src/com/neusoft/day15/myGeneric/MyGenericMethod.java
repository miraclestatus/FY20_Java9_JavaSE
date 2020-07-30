package com.neusoft.day15.myGeneric;

/**
 * @author Eric Lee
 * @date 2020/7/30 09:19
 */
public class MyGenericMethod {
    public <MVP>void show(MVP mvp){
        System.out.println(mvp.getClass());
    }
    public <MVP>  MVP show2(MVP mvp){
        return mvp;
    }
}
