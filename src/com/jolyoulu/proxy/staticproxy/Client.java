package com.jolyoulu.proxy.staticproxy;


/**
 * @Author: JolyouLu
 * @Date: 2020/11/22 14:17
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过执行代理对象的方法，代理对象调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
