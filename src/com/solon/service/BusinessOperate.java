package com.solon.service;

import com.solon.bean.Person;

import java.util.Comparator;

/**
 * 业务操作类，主要具体负责增、删、改、查、排序等的方法实现
 */
@SuppressWarnings({"all"})
public class BusinessOperate {

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
    public static void add() {

    }

    /**
     * 查询全部记录操作
     */
    public static void showAll() {

    }

    /**
     * 按姓名查询记录操作
     */
    public static void searchByName() {

    }

    /**
     * 按年龄查询记录操作
     */
    public static void searchByAge() {

    }

    /**
     * 按性别查询记录操作
     */
    public static void searchBySex() {

    }

    /**
     * 按电话号码查询记录操作
     */
    public static void searchByPhone() {

    }

    /**
     * 按住址查询记录操作
     */
    public static void searchByAddress() {

    }

    /**
     * 修改指定记录操作
     */
    public static void modify() {

    }

    /**
     * 删除指定记录操作
     */
    public static void delete() {

    }

    /**
     * 删除全部记录操作
     */
    public static void deleteAll() {

    }

    /**
     * 按姓名来排序记录操作
     */
    public static void sortByName() {

    }

    /**
     * 按年龄来排序记录操作
     */
    public static void sortByAge() {

    }

    /**
     * 按性别来排序记录操作
     */
    public static void sortBySex() {

    }
}
