package com.jolyoulu.iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 23:02
 * @Version 1.0
 */
public class OutputImpl {

    //初始化学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历学院获取专业
    public void printCollege(){
        //从collegeList获取所有学院
        for (College college : collegeList) {
            System.out.println("====="+college.getName()+"=====");
            printDepartment(college.creatIterator());
        }
    }

    //学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
