package com.neusoft.day06;

/**
 * @author Eric Lee
 * @date 2020/7/20 14:28
 */
public class Demo4 {
    public static void main(String[] args) {
//        1. 定义类 Demo4,类中定义 main方法,定义int类型a为10, b为10.
            int a = 10;
            int b = 10;

//        5. main方法中,调用printNum方法,传入a,b
        printNum(a, b);
//        6. main方法中,调用doubling方法,传入a,b
        doubling(a, b);
//        7. main方法中,调用printNum方法,传入a,b
        printNum(a,b);
        System.out.println("*************************");
//        8. main方法中,调用doubling方法,传入a,用a接收返回值
        a = doubling(a);
//        9. main方法中,调用doubling方法,传入b,用b接收返回值
        b = doubling(b);
//        10. main方法中,调用printNum方法,传入a,b
        printNum(a, b);

    }
    //        2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
    public static  void printNum(int iVar, int iVar2){
        System.out.println("iVar"+iVar+", iVar2" + iVar2);

    }
//        3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
    public static void doubling(int r, int p){
        r *= 2;
        p *= 2;
        System.out.println("翻倍的 r=" + r + ", p" + p);
    }
//        4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
    public static int doubling(int r){
    r *= 2;
    return r;
}



}
