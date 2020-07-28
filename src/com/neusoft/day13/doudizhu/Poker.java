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
//        System.out.println(pokerBox);
        // 洗牌
        Collections.shuffle(pokerBox);

    }

}
