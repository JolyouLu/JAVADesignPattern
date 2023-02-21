package com.jolyoulu.command;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/29 20:49
 * @Version 1.0
 * 命令接口
 */
public interface Command {
    //执行操作
    void execute();
    //撤销操作
    void undo();
}
