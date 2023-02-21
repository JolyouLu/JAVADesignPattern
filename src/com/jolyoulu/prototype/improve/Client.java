package com.jolyoulu.prototype.improve;

/**
 * @Author: LZJ
 * @Date: 2020/11/5 23:14
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        sheep1.setFriend(new Sheep("jack",2,"黑色"));

        Sheep sheep2 = sheep1.clone();
        Sheep sheep3 = sheep1.clone();

        System.out.println("sheep1.hashCode = "+sheep1.hashCode()+" Info = " +sheep1 + "sheep1.friend.hashCode = " + sheep1.getFriend().hashCode());
        System.out.println("sheep2.hashCode = "+sheep2.hashCode()+" Info = " +sheep2 + "sheep2.friend.hashCode = " + sheep2.getFriend().hashCode());
        System.out.println("sheep3.hashCode = "+sheep3.hashCode()+" Info = " +sheep3 + "sheep3.friend.hashCode = " + sheep3.getFriend().hashCode());

    }
}
