package com.solon.bean;

/**
 * 电话本的菜单类，用于生成各种菜单
 */
@SuppressWarnings({"all"})
public class Menu {
    /**
     * 主菜单界面
     */
    public static void mainMenu() {
        System.out.println("  =========欢迎使用智能电话本=========  ");
        System.out.println("**           业务列表如下：           **");
        System.out.println("**            1.添加记录             **");
        System.out.println("**            2.查找记录             **");
        System.out.println("**            3.修改记录             **");
        System.out.println("**            4.删除记录             **");
        System.out.println("**            5.排序记录             **");
        System.out.println("**            6.退出系统             **");
        System.out.println("  ==========项目问题服务方式=========  ");
        System.out.println("**     联系邮箱：947828712@qq.com    **");
        System.out.println("**     欢迎您提出宝贵的意见、建议~~     **");
        System.out.println("  =================================  ");
    }

    /**
     * 添加菜单界面
     */
    public static void addMenu() {
        System.out.println("  ============添加服务ing============  ");
        System.out.println("**           1.添加新的记录           **");
        System.out.println("**           2.查看全部记录           **");
        System.out.println("**           3.返回上一级             **");
        System.out.println("**           4.退出系统               **");
        System.out.println("  ==================================  ");
    }

    /**
     * 查找菜单界面
     */
    public static void searchMenu() {
        System.out.println("  ============查找服务ing============  ");
        System.out.println("**           1.按姓名查找             **");
        System.out.println("**           2.按年龄查找             **");
        System.out.println("**           3.按性别查找             **");
        System.out.println("**           4.按号码查找             **");
        System.out.println("**           5.按住址查找             **");
        System.out.println("**           6.查看全部记录            **");
        System.out.println("**           7.返回上一级             **");
        System.out.println("**           8.退出系统               **");
        System.out.println("  ==================================  ");
    }

    /**
     * 修改菜单界面
     */
    public static void modifyMenu() {
        System.out.println("  ============修改服务ing============  ");
        System.out.println("**           1.修改指定记录           **");
        System.out.println("**           2.查看全部记录           **");
        System.out.println("**           3.返回上一级             **");
        System.out.println("**           4.退出系统               **");
        System.out.println("  ==================================  ");
    }

    /**
     * 修改子菜单界面
     */
    public static void modifySubMenu() {
        System.out.println("  ============修改服务ing============  ");
        System.out.println("**           1.修改姓名              **");
        System.out.println("**           2.修改年龄              **");
        System.out.println("**           3.修改性别              **");
        System.out.println("**           4.修改号码              **");
        System.out.println("**           5.修改地址              **");
        System.out.println("**           6.返回上一级            **");
        System.out.println("  ==================================  ");
    }

    /**
     * 删除菜单界面
     */
    public static void deleteMenu() {
        System.out.println("  ============删除服务ing============  ");
        System.out.println("**           1.删除指定记录            **");
        System.out.println("**           2.删除全部记录            **");
        System.out.println("**           3.查看全部记录            **");
        System.out.println("**           4.返回上一级              **");
        System.out.println("**           5.退出系统               **");
        System.out.println("  ==================================  ");
    }

    /**
     * 排序菜单页面
     */
    public static void sortMenu() {
        System.out.println("  ============排序服务ing============  ");
        System.out.println("**           1.按姓名排序             **");
        System.out.println("**           2.按年龄排序             **");
        System.out.println("**           3.按性别排序             **");
        System.out.println("**           4.查看全部记录            **");
        System.out.println("**           5.返回上一级             **");
        System.out.println("**           6.退出系统               **");
        System.out.println("  ==================================  ");
    }

    /**
     * 退出菜单界面
     */
    public static void exitMenu() {
        System.out.println("  ============感谢您的使用============  ");
        System.out.println("**     联系邮箱：947828712@qq.com     **");
        System.out.println("**     欢迎您提出宝贵的意见、建议~~      **");
        System.out.println("  ==================================  ");
    }
}
