package com.neusoft.day10;

import com.neusoft.day09.zuoye1.C;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/7/24 11:11
 */
public class TestDy {
    public static void main(String[] args) {
//        // 使用多态方式
//       Animal a1 =  new Cat();
//       // 执行的是子类重写后方法
//       a1.eat();
//       Animal a2 = new Dog();
//       a2.eat();
//        Cat c =  new Cat();
//        Dog d =  new Dog();
//        showCatEat(c);
//        showDogEat(d);
//        // 以上两个方法，均可以被showAnimalEat(Animal animal)方法替代
//        // 执行效果一致
//        // 实际的开发过程中， 父类类型作为方法的形式参数, 传递子类对象给方法，
//        //  进行方法的调用，更能体现出多态的扩展性与遍历性。
//        showAnimalEat(c);
//        showAnimalEat(d);
//        List<String> list = new ArrayList<>();

        Animal a = new Cat(); // 向上转型
        a.eat();
////        Cat c = (Cat)a;  // 向下转型
////        c.catchMouse();
//        Dog d = (Dog)a;  // 向下转型
//        d.watchHouse(); // ClassCastException
        // 为了避免转型发生异常，最好先做个判断
//        变量名 instanceof 数据类型
        // 向下转型
        if(a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }else if (a instanceof Dog){
            Dog d = (Dog)a;
            d.watchHouse();
        }


    }

    public static void showCatEat(Cat cat){
        cat.eat();
    }
    public static void showDogEat(Dog dog){
        dog.eat();
    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }

}
