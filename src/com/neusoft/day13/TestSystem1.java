package com.neusoft.day13;

/**
 * @author Eric Lee
 * @date 2020/7/28 10:11
 */
public class TestSystem1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999 ; i++) {
            System.out.print(i);
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end -start));
    }
}
