package com.solon.app;

import com.solon.bean.Menu;
import com.solon.util.DataCheck;

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
            num = DataCheck.menuOptionCheck(1, 6);//得到用户输入并校验后的数字
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
