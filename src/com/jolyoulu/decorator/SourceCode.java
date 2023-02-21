package com.jolyoulu.decorator;

import sun.java2d.pipe.SpanIterator;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 19:19
 * @Version 1.0
 */
public class SourceCode {
    public static void main(String[] args) throws Exception{

        //1.InputStream 是抽象类，类似我们前面讲的Drink
        //2.FileInputStream 是 InputStream 子类，类似我们前面的PearlMilkTea，BerryTea
        //3.FilterInputStream 是 InputStream 子类，类似我们前面的Decorator修饰者
        //  FilterInputStream 中 protected volatile InputStream in; 保持着被修饰者
        //4.DataInputStream 是 FilterInputStream 子类，类似我们前面的Pearl，NataDeCoco
        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\test.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
