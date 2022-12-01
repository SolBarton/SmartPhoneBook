package com.solon.service;

import com.solon.bean.Menu;
import com.solon.bean.Person;
import com.solon.util.DataCheck;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Vector;

/**
 * 业务操作类，主要具体负责增、删、改、查、排序等的方法实现
 */
@SuppressWarnings({"all"})
public class BusinessOperate {
    private static Vector<Person> persons = new Vector<>();//用Vector集合类来存放Person对象

    /**
     * SortName内部类，实现一个按姓名排序的比较器的功能
     */
    class SortName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            //说明：
            //1.Locale类通常用来表示不同国家、地区等，它提供了一些方便的静态常量，
            //  可以使用它来为常用的区域设置创建Locale对象,例如：Locale.CHINA 表示中国地区
            //2.Collator抽象类执行区域设置的String比较，可以使用此类来构建语言文本的搜索和排序，
            //  而getInstance方法可以获得给定的语言环境的Collator对象
            Collator collator = Collator.getInstance(Locale.CHINA);
            return collator.compare(o1.getName(), o2.getName());
        }
    }

    /**
     * SortAge内部类，实现一个按年龄排序的比较器
     */
    class SortAge implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            //将两个Person对象的年龄相减，返回一个int值
            return o1.getAge() - o2.getAge();
        }
    }

    /**
     * SortSex内部类，实现一个按性别排序的比较器
     */
    class SortSex implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            //同上SortName比较器实现原理一样
            Collator collator = Collator.getInstance(Locale.CHINA);
            return collator.compare(o1.getSex(), o2.getSex());
        }
    }

    /**
     * 添加新纪录操作
     */
    public void add() {
        while (true) {
            System.out.println("=====**请根据提示信息进行添加操作**=====");
            String inputName = DataCheck.nameCheck();
            String inputSex = DataCheck.sexCheck();
            int inputAge = DataCheck.ageCheck();
            String inputPhone = DataCheck.phoneNumCheck();
            String inputAddress = DataCheck.addressCheck();
            Person person = new Person(inputName, inputSex, inputAge, inputPhone, inputAddress);//创建一个person对象
            persons.add(person);//添加到Vector集合中
            person.setId(persons.size());//将该对象ID设置为集合的元素数量
            System.out.println("=====**添加成功**=====");
            //用户操作选项
            System.out.println("请您输入选择：1.继续添加 2.返回上一级");
            int userInput = DataCheck.menuOptionCheck(1, 2);
            if( userInput == 2) {//用户不想继续添加
                break;
            }
        }
    }

    /**
     * 查询全部记录操作
     */
    public void showAll() {
        if(persons.size() == 0) {//不存在记录操作
            System.out.println("===============**记录列表**===============");
            System.out.println("                                         ");
            System.out.println("               暂无任何记录                ");
            System.out.println("                                         ");
            System.out.println("===============***********===============");
            System.out.println("请您输入选择：1.添加新记录 2.返回上一级");
            int userInput = DataCheck.menuOptionCheck(1, 2);
            if(userInput == 1) {
                add();
                return;
            }else {
                return;
            }
        }

        //存在记录的操作
        System.out.println("======================================**记录列表**======================================");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        System.out.println("======================================***********======================================");

    }

    /**
     * 按姓名查询记录操作
     */
    public void searchByName() {
        if(persons.size() == 0) {//判断列表中是否有记录
            System.out.println("温馨提示：您的列表空空如也，什么也查不到~~");
            return;
        }

        //列表中存在记录的操作
        int index = -1;//记录要查询内容的索引
        System.out.println("====**请输入想要查找的姓名**====");
        String userInput = DataCheck.nameCheck();
        System.out.println("====================================**查询结果如下**====================================");
        for (int i = 0; i < persons.size(); i++) {
            if(((persons.get(i)).getName()).equals(userInput)) {//查到列表中存在的操作
                index = i;
                System.out.println(persons.get(index));
            }

            //没有查询到的操作
            if(i == (persons.size() - 1) && index == -1) {
                System.out.println("                                没有查询到记录此姓名的信息                                  ");
            }
        }
        System.out.println("======================================***********======================================");

    }

    /**
     * 按年龄查询记录操作
     */
    public void searchByAge() {
        if(persons.size() == 0) {//判断列表中是否有记录
            System.out.println("温馨提示：您的列表空空如也，什么也查不到~~");
            return;
        }

        //列表中存在记录的操作
        int index = -1;//记录要查询内容的索引
        System.out.println("====**请输入想要查找的年龄**====");
        int userInput = DataCheck.ageCheck();
        System.out.println("====================================**查询结果如下**====================================");
        for (int i = 0; i < persons.size(); i++) {
            if((persons.get(i)).getAge() == userInput) {//查到列表中存在的操作
                index = i;
                System.out.println(persons.get(index));
            }

            //没有查询到的操作
            if(i == (persons.size() - 1) && index == -1) {
                System.out.println("                                没有查询到记录此年龄的信息                                  ");
            }
        }
        System.out.println("======================================***********======================================");
    }

    /**
     * 按性别查询记录操作
     */
    public void searchBySex() {
        if(persons.size() == 0) {//判断列表中是否有记录
            System.out.println("温馨提示：您的列表空空如也，什么也查不到~~");
            return;
        }

        //列表中存在记录的操作
        int index = -1;//记录要查询内容的索引
        System.out.println("====**请输入想要查找的性别**====");
        String userInput = DataCheck.sexCheck();
        System.out.println("====================================**查询结果如下**====================================");
        for (int i = 0; i < persons.size(); i++) {
            if(((persons.get(i)).getSex()).equals(userInput)) {//查到列表中存在的操作
                index = i;
                System.out.println(persons.get(index));
            }

            //没有查询到的操作
            if(i == (persons.size() - 1) && index == -1) {
                System.out.println("                                没有查询到记录此性别的信息                                  ");
            }
        }
        System.out.println("======================================***********======================================");
    }

    /**
     * 按电话号码查询记录操作
     */
    public void searchByPhone() {
        if(persons.size() == 0) {//判断列表中是否有记录
            System.out.println("温馨提示：您的列表空空如也，什么也查不到~~");
            return;
        }

        //列表中存在记录的操作
        int index = -1;//记录要查询内容的索引
        System.out.println("====**请输入想要查找的电话号码**====");
        String userInput = DataCheck.phoneNumCheck();
        System.out.println("====================================**查询结果如下**====================================");
        for (int i = 0; i < persons.size(); i++) {
            if(((persons.get(i)).getPhoneNumber()).equals(userInput)) {//查到列表中存在的操作
                index = i;
                System.out.println(persons.get(index));
            }

            //没有查询到的操作
            if(i == (persons.size() - 1) && index == -1) {
                System.out.println("                               没有查询到记录此电话号码的信息                                  ");
            }
        }
        System.out.println("======================================***********======================================");
    }

    /**
     * 按住址查询记录操作
     */
    public void searchByAddress() {
        if(persons.size() == 0) {//判断列表中是否有记录
            System.out.println("温馨提示：您的列表空空如也，什么也查不到~~");
            return;
        }

        //列表中存在记录的操作
        int index = -1;//记录要查询内容的索引
        System.out.println("====**请输入想要查找的地址**====");
        String userInput = DataCheck.addressCheck();
        System.out.println("====================================**查询结果如下**====================================");
        for (int i = 0; i < persons.size(); i++) {
            if(((persons.get(i)).getAddress()).equals(userInput)) {//查到列表中存在的操作
                index = i;
                System.out.println(persons.get(index));
            }

            //没有查询到的操作
            if(i == (persons.size() - 1) && index == -1) {
                System.out.println("                                没有查询到记录此地址的信息                                  ");
            }
        }
        System.out.println("======================================***********======================================");
    }

    /**
     * 修改指定记录操作
     */
    public void modify() {
        if(persons.size() == 0) {//列表中没有记录的操作
            System.out.println("温馨提示：抱歉，您的列表中没有能进行修改的记录~~");
            return;
        }

        //列表中存在记录的操作
        Person person = null;//表示要进行修改的对象
        showAll();//方便用户修改前获取到信息序号
        System.out.println("====**请输入想要修改列表记录所对应的序号**====");
        int userInput = DataCheck.menuOptionCheck(1, persons.size());
        person = persons.get(userInput - 1);//要修改的对象
        while (true) {
            Menu.modifySubMenu();//调用打开修改页面子界面
            int item = DataCheck.menuOptionCheck(1, 7);
            switch (item) {
                case 1://修改姓名
                    System.out.println("====**请输入修改后的姓名**====");
                    String nameInput = DataCheck.nameCheck();
                    person.setName(nameInput);
                    System.out.println("====**修改成功**====");
                    System.out.println("====================================**修改结果如下**====================================");
                    System.out.println(person);//输出修改后的对象
                    System.out.println("======================================***********======================================");
                    break;
                case 2://修改年龄
                    System.out.println("====**请输入修改后的年龄**====");
                    int ageInput = DataCheck.ageCheck();
                    person.setAge(ageInput);
                    System.out.println("====**修改成功**====");
                    System.out.println("====================================**修改结果如下**====================================");
                    System.out.println(person);//输出修改后的对象
                    System.out.println("======================================***********======================================");
                    break;
                case 3://修改性别
                    System.out.println("====**请输入修改后的性别**====");
                    String sexInput = DataCheck.sexCheck();
                    person.setSex(sexInput);
                    System.out.println("====**修改成功**====");
                    System.out.println("====================================**修改结果如下**====================================");
                    System.out.println(person);//输出修改后的对象
                    System.out.println("======================================***********======================================");
                    break;
                case 4://修改号码
                    System.out.println("====**请输入修改后的号码**====");
                    String phoneInput = DataCheck.phoneNumCheck();
                    person.setPhoneNumber(phoneInput);
                    System.out.println("====**修改成功**====");
                    System.out.println("====================================**修改结果如下**====================================");
                    System.out.println(person);//输出修改后的对象
                    System.out.println("======================================***********======================================");
                    break;
                case 5://修改地址
                    System.out.println("====**请输入修改后的地址**====");
                    String addressInput = DataCheck.addressCheck();
                    person.setAddress(addressInput);
                    System.out.println("====**修改成功**====");
                    System.out.println("====================================**修改结果如下**====================================");
                    System.out.println(person);//输出修改后的对象
                    System.out.println("======================================***********======================================");
                    break;
                case 6://返回上一级
                    return;
            }
        }
    }

    /**
     * 删除指定记录操作
     */
    public void delete() {
        if(persons.size() == 0) {//列表中没有记录的操作
            System.out.println("温馨提示：抱歉，您的列表中没有能进行删除的记录~~");
            return;
        }

        //列表中存在记录的操作
        showAll();//为了方便用户进行删除，自动打开记录列表
        System.out.println("====**请输入想要删除列表记录所对应的序号**====");
        int userInput = DataCheck.menuOptionCheck(1, persons.size());
        persons.remove(userInput - 1);
        System.out.println("=====**删除成功**=====");
        //重新进行编号
        if(persons.size() == 0) {//删除后列表中没有记录的操作
            return;
        }
        //删除后列表中仍然有记录
        for (int i = 0; i < persons.size(); i++) {
            (persons.get(i)).setId(i + 1);
        }
    }

    /**
     * 删除全部记录操作
     */
    public void deleteAll() {
        if(persons.size() == 0) {//列表中没有记录的操作
            System.out.println("温馨提示：不要再清啦，你的列表已经空空如也了~~");
            return;
        }

        //列表中存在记录操作
        persons.clear();//全部清空
        System.out.println("=====**全部删除成功**=====");
    }

    /**
     * 按姓名来排序记录操作
     * 排序规则：按照字母顺序进行正序排序，从首字母开始依次比较
     */
    public void sortByName() {
        if(persons.size() == 0) {//列表中没有记录的操作
            System.out.println("温馨提示：您的列表空空如也，无法进行排序功能~~");
            return;
        }

        //列表中有记录的操作
        Collections.sort(persons, new SortName());//调用sort方法实现排序
        //排序后重新规定序号
        for (int i = 0; i < persons.size(); i++) {
            (persons.get(i)).setId(i + 1);
        }
        System.out.println("=====**按姓名排序成功**=====");
    }

    /**
     * 按年龄来排序记录操作
     * 排序规则：按照年龄从小到大排序
     */
    public void sortByAge() {
        if(persons.size() == 0) {//列表中没有记录的操作
            System.out.println("温馨提示：您的列表空空如也，无法进行排序功能~~");
            return;
        }

        //列表中有记录的操作
        Collections.sort(persons, new SortAge());//调用sort方法实现排序
        //排序后重新规定序号
        for (int i = 0; i < persons.size(); i++) {
            (persons.get(i)).setId(i + 1);
        }
        System.out.println("=====**按年龄排序成功**=====");
    }

    /**
     * 按性别来排序记录操作
     * 排序规则：按照字母顺序进行正序排序，从首字母开始依次比较
     */
    public void sortBySex() {
        if(persons.size() == 0) {//列表中没有记录的操作
            System.out.println("温馨提示：您的列表空空如也，无法进行排序功能~~");
            return;
        }

        //列表中有记录的操作
        Collections.sort(persons, new SortSex());//调用sort方法实现排序
        //排序后重新规定序号
        for (int i = 0; i < persons.size(); i++) {
            (persons.get(i)).setId(i + 1);
        }
        System.out.println("=====**按性别排序成功**=====");
    }

    public Vector<Person> getPersons() {
        return persons;
    }

    public void setPersons(Vector<Person> persons) {
        this.persons = persons;
    }
}


