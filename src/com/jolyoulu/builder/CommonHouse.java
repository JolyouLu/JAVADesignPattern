package com.jolyoulu.builder;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 21:10
 * @Version 1.0
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void rooted() {
        System.out.println("普通房子封顶");
    }
}
