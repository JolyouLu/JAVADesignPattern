package com.jolyoulu.principle.singleresponsibility;

/**
 * @Author: LZJ
 * @Date: 2020/8/24 12:28
 * @Version 1.0
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}
/**
 * 交通工具类
 * 方案3
 * 1、这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2、虽然没有在类级别上遵守单一职责原则，但是在方法级别上是遵守了单一职责原则
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行...");
    }

    public void runWater(String vehicle) { System.out.println(vehicle + " 在水上运行...");
    }
}
