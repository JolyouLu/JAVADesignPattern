package com.jolyoulu.principle.inversion;

/**
 * @Author: LZJ
 * @Date: 2020/8/30 14:25
 * @Version 1.0
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件消息:hello world";
    }
}
class WeiXin{
    public String getInfo(){
        return "微信消息:hello world";
    }
}
/**
 * 完成一个Person接收消息的功能
 * 方案1
 * 1.简单，比较容易实现想到
 * 2.如果我们获取的对象是微信、短信等，则需要新增类，同时Person也要添加方法
 * 3.解决思路：引入一个抽象的接口Ireceiver，表示接收者，这样Person类与接口发生依赖
 *   因为Email，微信，等都属于接受的范围，他们只需要各自实现Ireceiver即可
 */
class Person{
    //接受一个电子邮件
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
    //接受一个微信消息
    public void receive(WeiXin weiXin){
        System.out.println(weiXin.getInfo());
    }
}
