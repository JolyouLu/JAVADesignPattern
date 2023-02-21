package com.jolyoulu.proxy.staticproxy;

/**
 * @Author: JolyouLu
 * @Date: 2020/11/22 14:12
 * @Version 1.0
 * 静态代理，代理对象
 */
public class TeacherDaoProxy implements ITeacherDao{
    //目标对象，通过接口聚合
    private ITeacherDao target;

    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理。。。");
        target.teach();
        System.out.println("代理结束。。。");
    }

}
