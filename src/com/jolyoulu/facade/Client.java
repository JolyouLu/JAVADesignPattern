package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:32
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("=============================");
        homeTheaterFacade.ready();
        System.out.println("=============================");
        homeTheaterFacade.play();
        System.out.println("=============================");
        homeTheaterFacade.end();
        System.out.println("=============================");
    }
}
