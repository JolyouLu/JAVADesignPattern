package com.jolyoulu.composite;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/13 17:48
 * @Version 1.0
 */
public abstract class OrganizationComponent {

    private String name; //组织名称
    private String des; //组织说明

    //添加
    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    };

    //删除
    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    };

    //打印，抽象方法必须实现
    protected abstract void print();

    //构造方法
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
