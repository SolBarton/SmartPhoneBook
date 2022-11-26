package com.solon.util;

/**
 * 数据校验工具类，主要提供各项数据的校验方法
 */
@SuppressWarnings({"all"})
public class DataCheck {
    /**
     * 对菜单输入选项进行验证
     * @param min 选项最小值
     * @param max 选项最大值
     * @return 返回一个int类型
     */
    public static int menuOptionCheck(int min, int max) {
        String regex = "[0-9]{1}";//定义验证菜单选择的正则表达式
        while (true) {
            System.out.println("温馨提示：输入业务选项数字，范围为" + min + "~" + max);
            System.out.print("请进行输入：");
            String userInput = MyScanner.printString();//取出用户输入的信息
            if(userInput.matches(regex)) {//初步校验是否内容和长度有误
                int inputNum = Integer.parseInt(userInput);
                if(inputNum >= min && inputNum <= max) {//第二次检验用户输入业务选项是否存在
                    return inputNum;
                } else {
                    System.out.println("不存在此业务数字选项，请检查后重新输入！");
                }
            }else {
                System.out.println("输入的内容或长度有误，请检查后重新输入！");
            }
        }
    }

    /**
     * 对输入的姓名进行验证
     * @return 返回一个String类型
     */
    public static String nameCheck() {
        return null;//...
    }

    /**
     * 对输入的年龄进行验证
     * @return 返回一个int类型
     */
    public static int ageCheck() {
        return 0;//...
    }

    /**
     * 对输入的性别进行验证
     * @return 返回一个String类型
     */
    public static String sexCheck() {
        return null;//...
    }

    /**
     * 对输入的电话号码进行验证
     * @return 返回一个String类型
     */
    public static String phoneNumCheck() {
        return null;//...
    }

    /**
     * 对输入的地址进行验证
     * @return 返回一个String类型
     */
    public static String addressCheck() {
        return null;//...
    }
}
