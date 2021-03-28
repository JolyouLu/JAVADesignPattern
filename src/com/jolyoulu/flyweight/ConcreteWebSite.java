package com.jolyoulu.flyweight;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/27 12:21
 * @Version 1.0
 */
public class ConcreteWebSite extends WebSite{

    private String type = ""; //网站发布类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type + "，用户"+user.getName()+"，正在使用中");
    }
}
