package com.jolyoulu.iterator;

import java.util.Iterator;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 22:51
 * @Version 1.0
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0;//保持当前数组对象数量

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("JAVA","从入门到放弃");
        addDepartment("PHP","从入门到放弃");
        addDepartment("C","从入门到放弃");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator creatIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
