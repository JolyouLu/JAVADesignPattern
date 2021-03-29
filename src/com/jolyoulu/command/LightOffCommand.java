package com.jolyoulu.command;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/29 20:50
 * @Version 1.0
 */
public class LightOffCommand implements Command {
    //聚合LightReceiver
    private LightReceiver light;

    //构造器接收LightReceiver
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接收者方法
        light.on();
    }
}
