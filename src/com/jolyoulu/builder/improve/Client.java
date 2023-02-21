package com.jolyoulu.builder.improve;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 22:17
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //获取普通房
        CommonHouse commonHouse = new CommonHouse();
        //将来普通房传入指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //指挥者盖房返回产品
        House house = houseDirector.constructHouse();
        System.out.println(house);
    }
}
