package com.neusoft.day09.redbag;

/**
 * @author Eric Lee
 * @date 2020/7/23 10:48
 */
public class User {
    // 用户名
    private String userName;

    // 余额
    private int leftMoney;

    public User() {
    }

    public User(String userName, int leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("用户" + userName + "\t"+"余额为" + leftMoney + "元" );
    }
}
