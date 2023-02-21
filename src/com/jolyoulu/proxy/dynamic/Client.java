package com.jolyoulu.proxy.dynamic;

import com.jolyoulu.proxy.dynamic.TeacherDao;

/**
 * @Author: JolyouLu
 * @Date: 2020/11/22 14:17
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao target = new TeacherDao();
        //给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //内存中生成的代理对象=proxyInstanceclass com.sun.proxy.$Proxy0
        System.out.println("proxyInstance" + proxyInstance.getClass());
        //通过代理对象调用目标对方法
        proxyInstance.teach();
    }
}
