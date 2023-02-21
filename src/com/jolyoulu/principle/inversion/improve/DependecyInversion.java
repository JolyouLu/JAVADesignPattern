package com.jolyoulu.principle.inversion.improve;

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
interface IReceive{
    public String getInfo();
}
class Email implements IReceive{
    public String getInfo(){
        return "电子邮件消息:hello world";
    }
}
class WeiXin implements IReceive{
    public String getInfo(){
        return "微信消息:hello world";
    }
}
/**
 * 方案2
 */
class Person{
    public void receive(IReceive receive){
        System.out.println(receive.getInfo());
    }
}
