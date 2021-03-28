package com.jolyoulu.template.improve;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/28 20:20
 * @Version 1.0
 */
public abstract class SoyaMilk {

    //模板方法，make，用final修饰，防止子类覆盖
    final void make(){
        select();
        //如果钩子方法真执行
        if (customerWantCondiments()){
            add();
        }
        soak();
        beat();
    }

    //选择材料
    void select(){
        System.out.println("第一步：选择新鲜黄豆");
    }

    //添加不同的配料，抽象方法，由子类实现
    abstract void add();

    //浸泡
    void soak(){
        System.out.println("第三步：浸泡黄豆与配料");
    }

    //打豆浆
    void beat(){
        System.out.println("第四步：黄豆与配料放入豆浆机");
    }

    //钩子方法，决定是否添加配料
    boolean customerWantCondiments(){
        return true;
    }
}
