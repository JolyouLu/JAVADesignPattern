package com.jolyoulu.prototype.deepclone;

/**
 * @Author: JolyouLu
 * @Date: 2021/1/31 16:21
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("我是deepProtoType的成员变量", "");
        DeepProtoType dpt = new DeepProtoType("我是deepProtoType",deepCloneableTarget);

        //使用方式1完成深拷贝
        DeepProtoType dpt3 = (DeepProtoType) dpt.deepClone();
        System.out.println("dpt.deepCloneableTarget="+dpt.getDeepCloneableTarget().hashCode());
        System.out.println("dpt3.deepCloneableTarget="+dpt3.getDeepCloneableTarget().hashCode());

//        //使用方式1完成深拷贝
//        DeepProtoType dpt2 = (DeepProtoType) dpt.clone();
//        System.out.println("dpt.deepCloneableTarget="+dpt.getDeepCloneableTarget().hashCode());
//        System.out.println("dpt2.deepCloneableTarget="+dpt2.getDeepCloneableTarget().hashCode());

    }
}
