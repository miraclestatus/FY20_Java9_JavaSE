package com.neusoft.day12.redbag;

import com.neusoft.day12.redbag.utils.RedPacketFrame;

/**
 * @author Eric Lee
 * @date 2020/7/27 09:34
 */
public class MyRed extends RedPacketFrame {

    /**
     * 构造方法
     * title 界面的标题
     *
     * @param title
     */
    public MyRed(String title) {
        super(title);
    }
}
