package com.jolyoulu.command;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/29 20:56
 * @Version 1.0
 * 空操作对象，初始化的时候会需要用到
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
