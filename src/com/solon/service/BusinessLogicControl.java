package com.solon.service;

import com.solon.bean.Menu;
import com.solon.bean.Person;
import com.solon.util.DataCheck;

import java.util.Vector;

/**
 * 业务逻辑控制类，主要负责各项业务的逻辑实现
 */
@SuppressWarnings({"all"})
public class BusinessLogicControl {
    private Vector<Person> persons = new Vector<>();//用Vector集合类来存放Person对象

    /**
     * 用户添加记录业务控制
     */
    public void addLogic() {
        int item;//用户输入的选项

        while (true) {
            Menu.addMenu();//调用打开添加业务界面
            item = DataCheck.menuOptionCheck(1, 4);//得到经过校验后的用户输入
            switch (item) {
                case 1://添加新的记录
                    BusinessOperate.add();
                    break;
                case 2://查看全部记录
                    BusinessOperate.showAll();
                    break;
                case 3://返回上一级
                    return;
                case 4://退出系统
                    Menu.exitMenu();
                    System.exit(0);//直接关闭java虚拟机
            }
        }
    }

    /**
     * 用户查找记录业务控制
     */
    public void searchLogic() {
        int item;//用户输入的选项

        while (true) {
            Menu.searchMenu();//调用打开查询菜单界面
            item = DataCheck.menuOptionCheck(1, 8);//得到用户输入并经过校验的选项
            switch (item) {
                case 1://按姓名查找
                    BusinessOperate.searchByName();
                    break;
                case 2://按年龄查找
                    BusinessOperate.searchByAge();
                    break;
                case 3://按性别查找
                    BusinessOperate.searchBySex();
                    break;
                case 4://按号码查找
                    BusinessOperate.searchByPhone();
                    break;
                case 5://按住址查找
                    BusinessOperate.searchByAddress();
                    break;
                case 6://查看全部记录
                    BusinessOperate.showAll();
                    break;
                case 7://返回上一级
                    return;
                case 8://退出系统
                    Menu.exitMenu();
                    System.exit(0);
            }
        }
    }

    /**
     * 用户修改记录业务控制
     */
    public void modifyLogic() {
        int item;//用户输入的选项

        while (true) {
            Menu.modifyMenu();//调用打开修改菜单界面
            item = DataCheck.menuOptionCheck(1, 4);//得到用户输入并经过校验的选项
            switch (item) {
                case 1://修改指定记录
                    BusinessOperate.modify();
                    break;
                case 2://查看全部记录
                    BusinessOperate.showAll();
                    break;
                case 3://返回上一级
                    return;
                case 4://退出系统
                    Menu.exitMenu();
                    System.exit(0);
            }
        }
    }

    /**
     * 用户删除记录业务控制
     */
    public void deleteLogic() {
        int item;//用户输入的选项

        while (true) {
            Menu.deleteMenu();//调用打开删除菜单界面
            item = DataCheck.menuOptionCheck(1, 5);//得到用户输入并经过校验的选项
            switch (item) {
                case 1://删除指定记录
                    BusinessOperate.delete();
                    break;
                case 2://删除全部记录
                    BusinessOperate.deleteAll();
                    break;
                case 3://查看全部记录
                    BusinessOperate.showAll();
                    break;
                case 4://返回上一级
                    return;
                case 5://退出系统
                    Menu.exitMenu();
                    System.exit(0);
            }
        }
    }

    /**
     * 用户排序记录业务控制
     */
    public void sortLogic() {
        int item;//用户输入的选项

        while (true) {
            Menu.sortMenu();//调用打开排序菜单界面
            item = DataCheck.menuOptionCheck(1, 6);//得到用户输入并经过校验的选项
            switch (item) {
                case 1://按姓名排序
                    BusinessOperate.sortByName();
                    break;
                case 2://按年龄排序
                    BusinessOperate.sortByAge();
                    break;
                case 3://按性别排序
                    BusinessOperate.sortBySex();
                    break;
                case 4://查看全部记录
                    BusinessOperate.showAll();
                    break;
                case 5://返回上一级
                    return;
                case 6://退出系统
                    Menu.exitMenu();
                    System.exit(0);
            }
        }
    }

    public Vector<Person> getPersons() {
        return persons;
    }

    public void setPersons(Vector<Person> persons) {
        this.persons = persons;
    }

}
