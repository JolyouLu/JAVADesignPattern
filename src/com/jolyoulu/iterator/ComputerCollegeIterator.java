package com.jolyoulu.iterator;

import java.util.Iterator;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 22:38
 * @Version 1.0
 */
public class ComputerCollegeIterator implements Iterator {

    //定义ComputerCollege是怎么方式存放的
    Department[] departments;
    int position = 0; //访问位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        //如果遍历位置大于数组长度或者获取下标空返回false
        if (position >= departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        //返回当前位置，位置后移一位
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
