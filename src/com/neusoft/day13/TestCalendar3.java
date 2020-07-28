package com.neusoft.day13;

import java.util.Calendar;

/**
 * @author Eric Lee
 * @date 2020/7/28 09:07
 */
public class TestCalendar3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) ;
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2020年7月28日
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.YEAR, -3);

        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2020年7月28日

    }
}
