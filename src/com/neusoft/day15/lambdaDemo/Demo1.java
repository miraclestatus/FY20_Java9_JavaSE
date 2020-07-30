package com.neusoft.day15.lambdaDemo;

/**
 * @author Eric Lee
 * @date 2020/7/30 14:31
 */
public class Demo1 {
    public static void main(String[] args) {
        // 格式 ： (参数类型 参数名称) -> {代码语句}
        invoke(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("好饭了");
            }
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }

}
