package com.solon.util;

import java.util.Scanner;

/**
 * 用户输入工具类，实现用户输入的内容
 */
@SuppressWarnings({"all"})
public class MyScanner {
    private static Scanner myScanner = new Scanner(System.in);//定义Scanner对象

    /**
     * 获取用户输入的String类型信息
     * @return 返回一个int类型
     */
    public static String printString() {
        return myScanner.next();
    }

    public Scanner getMyScanner() {
        return myScanner;
    }

    public void setMyScanner(Scanner myScanner) {
        this.myScanner = myScanner;
    }
}
