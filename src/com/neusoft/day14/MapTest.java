package com.neusoft.day14;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/29 10:59
 */
public class MapTest {
    public static void main(String[] args) {
        //  djhjsahausgdsa22211， 统计上面字符串每个字符出现的次数
        System.out.println("请输入一个字符串");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }
    public static void findChar(String line){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c, 1);
            }else {
                // 先获取原来出现的次数
                Integer count = map.get(c);

                map.put(c, ++count);
            }

        }
        System.out.println(map);
    }
}
