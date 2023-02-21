package com.jolyoulu.template;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/28 20:26
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //制作黑豆豆浆
        System.out.println("-----制作黑豆豆浆-----");
        SoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();
        //制作花生豆浆
        System.out.println("-----制作花生豆浆-----");
        SoyaMilk penutSoyaMilk = new PenutSoyaMilk();
        penutSoyaMilk.make();
    }
}
