package com.jolyoulu.composite;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/13 18:03
 * @Version 1.0
 */
public class Department extends OrganizationComponent{

    //构造器
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
