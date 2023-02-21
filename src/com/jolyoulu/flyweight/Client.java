package com.jolyoulu.flyweight;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/27 12:28
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        //客户需要一个新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("tom"));
        //客户需要一个博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("jack"));
        //客户需要一个博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("king"));
        System.out.println("当前池中的实例数量："+webSiteFactory.getWebSiteCount());
    }
}
