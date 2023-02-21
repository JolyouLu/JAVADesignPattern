package com.jolyoulu.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 22:43
 * @Version 1.0
 */
public class InfoCollegeIterator implements Iterator {

    //定义InfoCollege是怎么方式存放的
    List<Department> departmentList;
    int index = -1;//索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        //判断集合是否存在下一个
        if (index >= departmentList.size() - 1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
