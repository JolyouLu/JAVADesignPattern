package com.jolyoulu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/13 18:00
 * @Version 1.0
 */
public class College extends OrganizationComponent{

    //List中存放 Department
    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    //重写remove方法
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    //实现打印方法
    @Override
    protected void print() {
        System.out.println("----------------------"+getName()+"----------------------");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
