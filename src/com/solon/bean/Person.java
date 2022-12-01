package com.solon.bean;

import java.io.Serializable;

/**
 * 实体类Person，存放联系人的各种数据模型
 */
@SuppressWarnings({"all"})
public class Person implements Serializable {
    private int id;//序号
    private String name;//姓名
    private String sex;//性别
    private int age;//年龄
    private String phoneNumber;//电话号码
    private String address;//地址

    //有参构造器
    public Person(String name, String sex, int age, String phoneNumber, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //无参构造器
    public Person() {}

    /**
     * 重写toString方法，用于格式化输出指定信息
     * StringBuffer底层是可变字符序列，增删操作效率更高，并且线程安全
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("序号：" + this.id + "#\t\t姓名：" + this.name + "\t\t性别：" + this.sex
        + "\t\t年龄：" + this.age + "岁\t\t电话号码：" + this.phoneNumber + "\t\t地址："
        + this.address);
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
