package com.neusoft.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Eric Lee
 * @date 2020/7/29 09:22
 */
public class Demo3 {
    public static void main(String[] args) {
        // 创建map对象
        HashMap<String, String> map = new HashMap<>();
        map.put("吕布", "貂蝉");
        map.put("孙策", "大乔");
        map.put("周瑜", "二乔");
        map.put("刘备", "甘夫人");
        // 获取所有的entry对象
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 遍历每一个entry对象
        for(Map.Entry<String, String> entry : entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
