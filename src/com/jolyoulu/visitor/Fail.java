package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:28
 * @Version 1.0
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName()+" 评价这歌手是失败的");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName()+" 评价这歌手是失败的");
    }
}
