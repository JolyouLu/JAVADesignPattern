package com.jolyoulu.proxy.cglib;



/**
 * @Author: JolyouLu
 * @Date: 2020/11/22 14:17
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取代理对象，并且把目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxyInstance.teach();
    }
}
