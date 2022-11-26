package com.solon.bean;

/**
 * 实体类Person，存放联系人的各种数据模型
 */
@SuppressWarnings({"all"})
public class Person {
    private int id;//序号
    private String name;//姓名
    private char sex;//性别
    private int age;//年龄
    private String phoneNumber;//电话号码
    private String address;//地址

    public Person(int id, String name, char sex, int age, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
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
