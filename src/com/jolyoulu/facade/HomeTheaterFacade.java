package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:11
 * @Version 1.0
 */
public class HomeTheaterFacade {

    //定义各子系统对象
    private TheaterLights theaterLights;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    //构造器初始化
    public HomeTheaterFacade() {
        this.theaterLights = TheaterLights.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //准备
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLights.off();
    }

    //开始
    public void play(){
        dvdPlayer.play();
    }

    //关闭
    public void end(){
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
        theaterLights.on();
    }
}
