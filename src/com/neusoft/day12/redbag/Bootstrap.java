package com.neusoft.day12.redbag;

import com.neusoft.day09.redbag.Manager;

/**
 * @author Eric Lee
 * @date 2020/7/27 08:58]
 * 红包界面启动程序
 *
 *  普通红包： 之前介绍过
 *
 *
 */
public class Bootstrap {
    public static void main(String[] args) {

        // 设置标题
        MyRed myRed = new MyRed("Java9班抢红包");

        // 设置群主名
        myRed.setOwnerName("马云");

        //  设置分发策略
        // 普通红包
//        NormalMode normalMode = new NormalMode();
//        myRed.setOpenWay(normalMode);

        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);

    }
}
