package com.neusoft.day15.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Eric Lee
 * @date 2020/7/30 15:02
 */
public class Demo3 {
    public static void main(String[] args) {
        Person[] array = {
            new Person("貂蝉", 223),
            new Person("孙尚香", 18),
            new Person("妲己", 300),
            new Person("杨玉环", 221),
        };
        Comparator<Person> comp =  new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

        };
        // 第二个参数是排序规则
        Arrays.sort(array, comp);

        for(Person person : array){
            System.out.println(person);
        }

    }
//    new Comparator

}
