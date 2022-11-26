package com.solon.test;

import com.solon.bean.Person;

/**
 * 测试类，用于测试代码
 */
@SuppressWarnings({"all"})
public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        //代码测试
        System.out.println(new Person("tom", "男", 18, "13164090883", "北京"));
    }
}
