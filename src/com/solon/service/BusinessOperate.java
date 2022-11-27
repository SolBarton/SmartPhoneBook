package com.solon.service;

import com.solon.bean.Person;
import com.solon.util.DataCheck;

import java.util.Comparator;
import java.util.Vector;

/**
 * 业务操作类，主要具体负责增、删、改、查、排序等的方法实现
 */
@SuppressWarnings({"all"})
public class BusinessOperate {
    private Vector<Person> persons = new Vector<>();//用Vector集合类来存放Person对象

    /**
     * SortName内部类，实现一个按姓名排序的比较器的功能
     */
    class SortName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }

    /**
     * SortAge内部类，实现一个按年龄排序的比较器
     */
    class SortAge implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }

    /**
     * SortSex内部类，实现一个按性别排序的比较器
     */
    class SortSex implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
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
        System.out.println("按姓名查询记录");
    }

    /**
     * 按年龄查询记录操作
     */
    public void searchByAge() {
        System.out.println("按年龄查询记录");
    }

    /**
     * 按性别查询记录操作
     */
    public void searchBySex() {
        System.out.println("按性别查询记录");
    }

    /**
     * 按电话号码查询记录操作
     */
    public void searchByPhone() {
        System.out.println("按电话号码查询记录");
    }

    /**
     * 按住址查询记录操作
     */
    public void searchByAddress() {
        System.out.println("按住址查询记录");
    }

    /**
     * 修改指定记录操作
     */
    public void modify() {
        System.out.println("修改指定记录");
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
     */
    public void sortByName() {
        System.out.println("按姓名来排序记录");
    }

    /**
     * 按年龄来排序记录操作
     */
    public void sortByAge() {
        System.out.println("按年龄来排序记录");
    }

    /**
     * 按性别来排序记录操作
     */
    public void sortBySex() {
        System.out.println("按性别来排序记录");
    }

    public Vector<Person> getPersons() {
        return persons;
    }

    public void setPersons(Vector<Person> persons) {
        this.persons = persons;
    }
}


