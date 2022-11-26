package com.solon.app;

import com.solon.bean.Menu;
import com.solon.util.MyScanner;

/**
 * 智能电话本项目入口类
 */
@SuppressWarnings({"all"})
public class App {
    /**
     * 启动电话本项目
     * @param args
     */
    public static void main(String[] args) {
        new App().start();//启动项目
    }

    /**
     * 控制主菜单
     */
    public void start() {
        boolean loop = true;//循环判断条件
        int num;//用户输入的数字

        while (loop) {
            Menu.mainMenu();//打开主菜单界面
            System.out.print("请输入业务对应的数字，进入业务界面：");
            //进行数字校验...
            num = MyScanner.printInt();
            switch (num) {
                case 1:
                    //...
                case 2:
                    //...
                case 3:
                    //...
                case 4:
                    //...
                case 5:
                    //...
                case 6:
                    Menu.exitMenu();
                    loop = false;
                    break;
            }
        }
    }
}
