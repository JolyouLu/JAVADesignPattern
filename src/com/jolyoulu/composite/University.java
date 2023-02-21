package com.jolyoulu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/13 17:54
 * @Version 1.0
 */
//University 就是 Composite，可以管理College
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    //构造器
    public University(String name, String des) {
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
