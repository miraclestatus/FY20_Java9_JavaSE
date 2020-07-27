package com.neusoft.day12.redbag;

import com.neusoft.day12.redbag.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/7/27 09:21
 */
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        /**
         * 随机分配， totalMoney 单位是 :分
         * 最少 1分钱，最多不超过剩下金额平均数的2倍 ，应该越发越少
         * 随机金额公式： 1 + random.nextInt(最多不超过剩下金额平均数的2倍)
         * 随机金额公式： 1 + random.nextInt(leftMoney/leftCount*2)
         */
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        //  分别代表剩下多少钱和剩下多少分
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        // 随机发前 n-1个， 最后一个不需要随机
        for (int i = 0; i <totalCount -1 ; i++) {
            // 随机出来的金额
            int money = 1 + random.nextInt(leftMoney/leftCount*2);
            // 将随机出来的金额放入集合
            list.add(money);
            // 应该越发越少
            leftCount--; // 剩下的分数每次减一
            leftMoney -= money;
        }
        // 处理最后一个
        list.add(leftMoney);


        return list;
    }
}
