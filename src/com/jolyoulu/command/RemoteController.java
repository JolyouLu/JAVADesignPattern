package com.jolyoulu.command;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/29 20:58
 * @Version 1.0
 */
public class RemoteController {
    //开 按钮的命令数组
    private Command[] onCommands;
    //关 按钮的命令数组
    private Command[] offCommands;
    //撤销命令数组
    private Command undoCommands;

    //构造器初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        //初始化所有按钮
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给我们的按钮设置你需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int no){
        //按下开的按钮，调用对应的方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommands = onCommands[no];
    }

    //按下开按钮
    public void offButtonWasPushed(int no){
        //按下开的按钮，调用对应的方法
        offCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommands = offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommands.undo();
    }


}
