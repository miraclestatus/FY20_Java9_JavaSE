package com.neusoft.day06;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/20 16:52
 */
public class Demo9 {
    public static void main(String[] args) {
        System.out.println("请输入最大范围的那个数");
        int maxNumber = new Scanner(System.in).nextInt();
        guessNumber(maxNumber);

    }
    public static void guessNumber(int num){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(num) + 1;
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
