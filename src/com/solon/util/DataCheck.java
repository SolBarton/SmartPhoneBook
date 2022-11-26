package com.solon.util;

/**
 * 数据校验工具类，主要提供各项数据的校验方法
 */
@SuppressWarnings({"all"})
public class DataCheck {
    /**
     * 对菜单输入选项进行验证
     * 校验规则：1.满足用户输入的为0-9的数字并且长度为1 2.输入的数字在界面中有对应的业务选项
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
     * 校验规则：满足用户输入的姓名为中文或者英文，中文要求长度为1-5，英文要求2-10
     * @return 返回一个String类型
     */
    public static String nameCheck() {
        String regex = "([a-zA-Z]{2,10})||([\\u4e00-\\u9fa5]{1,5})";//定义验证输入姓名的正则表达式
        while (true) {
            System.out.println("温馨提示：输入姓名，只允许输入长度为1-5的中文或长度为2-10的英文");
            System.out.print("请进行输入:");
            String userInput = MyScanner.printString();//取出用户输入的信息
            if (userInput.matches(regex)) {//进行判断
                return userInput;
            }
            System.out.println("输入的姓名不符合要求，请检查后重新输入！");
        }
    }

    /**
     * 对输入的年龄进行验证
     * 校验规则：满足用户输入的年龄范围在1-100
     * @return 返回一个int类型
     */
    public static int ageCheck() {
        String regex = "[100]{3}||[1-9]{1}[0-9]{1}||[1-9]{1}";//定义验证输入年龄的正则表达式
        while (true) {
            System.out.println("温馨提示：输入年龄，只允许输入1-100的数字");
            System.out.print("请进行输入：");
            String userInput = MyScanner.printString();//取出用户输入的信息
            if (userInput.matches(regex)) {//进行判断
                int inputAge = Integer.parseInt(userInput);
                return inputAge;
            }
            System.out.println("输入的年龄不符合要求，请检查后重新输入！");
        }
    }

    /**
     * 对输入的性别进行验证
     * 校验规定：满足用户输入性别为男或者女
     * @return 返回一个String类型
     */
    public static String sexCheck() {
        String regex = "[男]{1}||[女]{1}";//定义验证输入性别的正则表达式
        while (true) {
            System.out.println("温馨提示：输入性别，只允许输入中文\"男\"或\"女\"");
            System.out.print("请进行输入：");
            String userInput = MyScanner.printString();//取出用户输入的信息
            if (userInput.matches(regex)) {//进行判断
                return userInput;
            }
            System.out.println("输入的性别不符合要求，请检查后重新输入！");
        }
    }

    /**
     * 对输入的电话号码进行验证
     * 校验规则：满足用户输入的电话号码可以为座机号，也可以为手机号
     * @return 返回一个String类型
     */
    public static String phoneNumCheck() {
        String regex = "(\\d{3,4}-\\d{7,8})||([1]{1}\\d{10})";//定义验证输入电话号码的正则表达式
        while (true) {
            System.out.println("温馨提示：输入电话号码，只允许输入手机号或者座机号(例如：XXX-XXXXXXX)");
            System.out.print("请进行输入：");
            String userInput = MyScanner.printString();//取出用户输入的信息
            if(userInput.matches(regex)) {//进行判断
                return userInput;
            }
            System.out.println("输入的电话号码不符合要求，请检查后重新输入！");
        }
    }

    /**
     * 对输入的地址进行验证
     * 校验规则：满足用户输入的地址构成为字母、数字、中文,长度不超过20
     * @return 返回一个String类型
     */
    public static String addressCheck() {
        String regex = "[a-zA-z0-9\\u4e00-\\u9fa5]{1,20}";//定义验证输入地址的正则表达式
        while (true) {
            System.out.println("温馨提示：输入地址，允许使用字母、数字、中文，长度不超过20");
            System.out.print("请进行输入：");
            String userInput = MyScanner.printString();//取出用户输入的信息
            if(userInput.matches(regex)) {//进行判断
                return userInput;
            }
            System.out.println("输入的地址不符合要求，请检查后重新输入！");
        }
    }
}
