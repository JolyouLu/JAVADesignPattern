package com.jolyoulu.principle.liskov.improve;

/**
 * @Author: LZJ
 * @Date: 2020/8/30 15:49
 * @Version 1.0
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-3="+a.fun1(1,3));
        System.out.println("==========================");
        B b = new B();
        System.out.println("11+3="+b.fun1(11,3));
        System.out.println("1+3="+b.fun1(1,3));
        System.out.println("11+3+9="+b.fun2(1,3));
        System.out.println("11-3="+b.fun3(11,3));
    }
}
//创建一个基类
class Base{

}
//A类
class A extends Base{
    public int fun1(int num1,int num2){
        return num1 - num2;
    }
}
//B类继承A
//增加了一新功能:
class B extends Base {
    private A a = new A();
    public int fun1(int a,int b){
        return a + b;
    }

    public int fun2(int a,int b){
        return fun1(a,b)+9;
    }

    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }

}
