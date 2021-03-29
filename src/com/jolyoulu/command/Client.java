package com.jolyoulu.command;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/29 21:09
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建电灯（接受者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯打开的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        //创建电灯关闭的命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //初始化一个遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置相关命令,no = 0 的是控制电灯的
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("--------按下开灯按钮--------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下关灯按钮--------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------撤销上一步操作--------");
        remoteController.undoButtonWasPushed();
    }
}
