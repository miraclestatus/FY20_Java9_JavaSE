package com.neusoft.day06;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/20 16:14
 */
public class Demo8 {
    public static void main(String[] args) {
        // 猜数字小游戏
        //  游戏开始时。会随机生成一个 1~ 100之间的随机整数 number
        // 玩家才一个数字，guessNumber 和  number进行比较
        // 提示猜大了还是猜小了， 知道玩家猜中
        // 统计玩家猜了几次，给予输出提示
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
//        System.out.println("number="+number);
        int count = 0;
        while (true){
            count++;
            System.out.println("请输入您猜的数字");
            int guessNumber = scanner.nextInt();
//            System.out.println("guessNumber="+guessNumber);
            if (guessNumber > number){
                System.out.println("您猜的数据"+ guessNumber +"猜大了");
            }else if (guessNumber < number){
                System.out.println("您猜的数据"+ guessNumber +"猜小了");
            }else {
                System.out.println("哎呀，你用"+ count + "次猜对了");
                break;
            }
        }

    }
}
