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
        System.out.println("添加新纪录");
    }

    /**
     * 查询全部记录操作
     */
    public static void showAll() {
        System.out.println("查询全部记录");
    }

    /**
     * 按姓名查询记录操作
     */
    public static void searchByName() {
        System.out.println("按姓名查询记录");
    }

    /**
     * 按年龄查询记录操作
     */
    public static void searchByAge() {
        System.out.println("按年龄查询记录");
    }

    /**
     * 按性别查询记录操作
     */
    public static void searchBySex() {
        System.out.println("按性别查询记录");
    }

    /**
     * 按电话号码查询记录操作
     */
    public static void searchByPhone() {
        System.out.println("按电话号码查询记录");
    }

    /**
     * 按住址查询记录操作
     */
    public static void searchByAddress() {
        System.out.println("按住址查询记录");
    }

    /**
     * 修改指定记录操作
     */
    public static void modify() {
        System.out.println("修改指定记录");
    }

    /**
     * 删除指定记录操作
     */
    public static void delete() {
        System.out.println("删除指定记录");
    }

    /**
     * 删除全部记录操作
     */
    public static void deleteAll() {
        System.out.println("删除全部记录");
    }

    /**
     * 按姓名来排序记录操作
     */
    public static void sortByName() {
        System.out.println("按姓名来排序记录");
    }

    /**
     * 按年龄来排序记录操作
     */
    public static void sortByAge() {
        System.out.println("按年龄来排序记录");
    }

    /**
     * 按性别来排序记录操作
     */
    public static void sortBySex() {
        System.out.println("按性别来排序记录");
    }
}
