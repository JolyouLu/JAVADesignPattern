package com.jolyoulu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 22:59
 * @Version 1.0
 */
public class InfoCollege implements College{

    List<Department> departmentList;

    public InfoCollege() {
        this.departmentList = new ArrayList<>();
        addDepartment("信息安全","从入门到放弃");
        addDepartment("网络安全","从入门到放弃");
        addDepartment("综合布线","从入门到放弃");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator creatIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
