package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:27
 * @Version 1.0
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName()+" 评价这歌手成功的");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName()+" 评价这歌手成功的");
    }
}
