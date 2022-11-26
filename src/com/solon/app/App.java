package com.solon.app;

import com.solon.bean.Menu;

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
        Menu.mainMenu();//打开主菜单界面
    }
}
