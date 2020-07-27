package com.neusoft.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/7/27 16:21
 */
public class TestDate3 {
    public static void main(String[] args) throws ParseException {
        String str = "2001年6月6日";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = df.parse(str);
        System.out.println(date);
        // Wed Jun 06 00:00:00 CST 2001

    }
}
