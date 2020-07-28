package com.neusoft.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/7/28 09:12
 */
public class TestCalendar4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date); // Tue Jul 28 09:13:15 CST 2020

        Date date1 = new Date();
        System.out.println(date1); // Tue Jul 28 09:13:15 CST 2020


    }
}
