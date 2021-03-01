package com.jolyoulu.builder.improve;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 22:10
 * @Version 1.0
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBaise("普通房子打地基5米");
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通房子砌墙3米高");
        System.out.println("普通房子砌墙3米高");
    }

    @Override
    public void rooted() {
        house.setRoofed("普通房子水泥浇筑屋顶");
        System.out.println("普通房子水泥浇筑屋顶");
    }
}
