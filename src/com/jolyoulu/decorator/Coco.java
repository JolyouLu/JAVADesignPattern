package com.jolyoulu.decorator;

import com.jolyoulu.decorator.burden.NataDeCoco;
import com.jolyoulu.decorator.burden.Pudding;
import com.jolyoulu.decorator.item.PearlMilkTea;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 17:14
 * @Version 1.0
 */
public class Coco {
    public static void main(String[] args) {
        //点一份珍珠奶茶
        Drink order = new PearlMilkTea();
        System.out.println("当前费用="+order.cost()+" 订单描述="+order.getDes());
        //加一份布丁
        order = new Pudding(order);
        System.out.println("当前费用="+order.cost()+" 订单描述="+order.getDes());
        //加一份椰果
        order = new NataDeCoco(order);
        System.out.println("当前费用="+order.cost()+" 订单描述="+order.getDes());
        //加一份椰果
        order = new NataDeCoco(order);
        System.out.println("当前费用="+order.cost()+" 订单描述="+order.getDes());
    }
}
