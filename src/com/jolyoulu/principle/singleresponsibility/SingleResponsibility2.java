package com.jolyoulu.principle.singleresponsibility;

/**
 * @Author: LZJ
 * @Date: 2020/8/24 12:18
 * @Version 1.0
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}
/**
 * 交通工具类
 * 方案2
 * 1、遵守单一职责原则
 * 2、但是这样做改动会很大，即每出现一种新的交通工具我就要创建一个类，并且也要修改客户端
 * 改进：看方案3，直接修改Vechicle类，改动的代码会比较少
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在天空上运行...");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在水上运行...");
    }
}


