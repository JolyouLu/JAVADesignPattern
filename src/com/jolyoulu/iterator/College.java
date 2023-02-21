package com.jolyoulu.iterator;

import java.util.Iterator;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 22:46
 * @Version 1.0
 */
public interface College {

    String getName();

    //添加系
    void addDepartment(String name,String desc);

    //获取系对应迭代器
    Iterator creatIterator();

}
