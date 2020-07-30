package com.neusoft.day15.lambdaDemo;

/**
 * @author Eric Lee
 * @date 2020/7/30 16:48
 */
public class Demo5 {
    public static void main(String[] args) {
        // 使用lambda表达式 调用测试
        invokeCalc(5,6, (int a, int b)->{
            return a + b;
        });

    }
    public static void invokeCalc(int a, int b, Calculator calculator){
        int res = calculator.calc(a, b);
        System.out.println("res = "+ res);
    }
}
