package com.neusoft.day13.doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/7/28 16:15
 * 斗地主 的洗牌和发牌动作
 *  规则： 使用54张牌打乱顺序， 三个玩家参与游戏， 每人17张牌 最后剩三张底牌
 *  - 准备牌： 每张牌由花色和数字组成
 *  - 发牌
 *  - 看牌
 */
public class Poker {
    public static void main(String[] args) {

        // 准备牌： 每张牌由花色和数字组成
        // 创建牌盒, 存储牌
        List<String> pokerBox = new ArrayList<>();
        // 创建数字集合
        List<String>  numbers = new ArrayList<>();
        // 创建花色集合numbers
        List<String> colors = new ArrayList<>();
        // 添加花色
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for (int i = 2; i <= 10 ; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        // 生产牌， 拼接花色和数字
        for(String color: colors){
            // 每次拿到一种花色
            for(String number :numbers){
//                String card = color + number;
//                pokerBox.add(card);
                pokerBox.add(color+number);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        //  System.out.println(pokerBox);
        // 洗牌: Collections 工具类 都是静态方法
        // shuffle() 使用默认随机元对指定列表进行置换
        Collections.shuffle(pokerBox);
        //   System.out.println(pokerBox);
        // 发牌 创建player1、player2、player3、dipai底牌4个集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            // 判断i值，先判断
            if(i >= 51){
                dipai.add(card);
            }else {
                if(i%3==0){
                   player1.add(card);
                }else if (i%3==1){
                    player2.add(card);
                }else {
                    player3.add(card);

                }
            }
        }

        // look look
        System.out.println("王思聪的牌"+ player1);
        System.out.println("马云的牌"+ player2);
        System.out.println("我的牌"+ player3);
        System.out.println("底牌"+ dipai);

    }

}
