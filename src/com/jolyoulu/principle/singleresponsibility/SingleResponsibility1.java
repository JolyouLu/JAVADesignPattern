package com.jolyoulu.principle.singleresponsibility;

/**
 * @Author: LZJ
 * @Date: 2020/8/24 12:12
 * @Version 1.0
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}
/**
 * 交通工具类
 * 方案1
 * 1、在方案1 的run方法中，违法了单一职责原则
 * 2、解决的方案非常简单，根据交通工具运行方法不同，分解成不同类即可
 * 改进：看方案2拆分出多个类每一个类负责一个职责
 */
class Vehicle {
    public void run(String vehicle) {
        if (vehicle.equals("汽车")){
            System.out.println(vehicle + " 在公路上运行...");
        }else if (vehicle.equals("飞机")){
            System.out.println(vehicle + " 在天空上运行...");
        }else if (vehicle.equals("轮船")){
            System.out.println(vehicle + " 在水上运行...");
        }else{
            System.out.println(vehicle + " 未知交通工具...");
        }
    }
}
