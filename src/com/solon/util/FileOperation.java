package com.solon.util;

import com.solon.bean.Person;
import com.solon.service.BusinessOperate;

import java.io.*;
import java.util.Vector;

/**
 * 文件操作工具类，负责将数据信息进行读取、写入操作
 */
@SuppressWarnings({"all"})
public class FileOperation {
    BusinessOperate bo = new BusinessOperate();//创建一个业务操作类的对象
    Vector<Person> persons = bo.getPersons();//获取persons对象

    /**
     * 文件信息提取
     */
    public void fileExtraction() {
        String filePath = "src\\com\\solon\\res\\Person.txt";//用于保存Person信息的文件
        File file = new File(filePath);
        //验证文件是否存在
        if(!file.exists()) {//文件不存在
            //创建一个该文件
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //文件存在
        //验证文件内容是否为null
        if(file == null) {
            return;
        }

        //文件不为null
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));//创建一个对象字节输入流
            while (true) {//存在EOFException异常
                persons.add((Person) ois.readObject());//将文件中Person对象反序列化，并添加到集合中
            }
        } catch (Exception e) {
            //不做任何操作
        } finally {
            //关闭流,释放资源
            try {
                if(ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 文件信息保存
     */
    public void fileSave() {
        //判断集合是否为null
        if(persons == null) {
            return;
        }

        //集合不为null
        String filePath = "src\\com\\solon\\res\\Person.txt";//保存Person对象信息的文件
        ObjectOutputStream oos = null;
        //将Person信息写入文件保存
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));//FileOutputStream使用覆盖方式写入
            for (int i = 0; i < persons.size(); i++) {
                oos.writeObject(persons.get(i));//将Person对象进行序列化，写入文件中
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流，释放资源
            try {
                if(oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
