package com.solon.app;

import com.solon.bean.Menu;
import com.solon.service.BusinessLogicControl;
import com.solon.util.DataCheck;
import com.solon.util.FileOperation;

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
        int item;//用户输入的选项
        BusinessLogicControl busControl = new BusinessLogicControl();//创建业务逻辑控制类的对象
        FileOperation fileOperation = new FileOperation();//创建文件操作工具类的对象

        while (loop) {
            fileOperation.fileExtraction();//文件信息读入
            Menu.mainMenu();//打开主菜单界面
            item = DataCheck.menuOptionCheck(1, 6);//得到用户输入并校验后的数字
            switch (item) {
                case 1://添加记录
                    busControl.addLogic();
                    break;
                case 2://查找记录
                    busControl.searchLogic();
                    break;
                case 3://修改记录
                    busControl.modifyLogic();
                    break;
                case 4://删除记录
                    busControl.deleteLogic();
                    break;
                case 5://排序记录
                    busControl.sortLogic();
                    break;
                case 6://退出系统
                    fileOperation.fileSave();//保存更新文件
                    Menu.exitMenu();
                    loop = false;
                    break;
            }
        }
    }
}
