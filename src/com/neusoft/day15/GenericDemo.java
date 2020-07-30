package com.neusoft.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Eric Lee
 * @date 2020/7/30 08:51
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        // list.add(5); 集合已经明确了具体元素存放的类型
        // 已经明确了类型，在使用迭代器的时候，迭代器也同样知道遍历元素的具体类型
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            // 使用iterator()在这里可以直接获取String类型
            System.out.println(str.length());
        }

        System.out.println(list);

    }
}
