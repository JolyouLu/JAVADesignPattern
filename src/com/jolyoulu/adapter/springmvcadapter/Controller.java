package com.jolyoulu.adapter.springmvcadapter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 1:54
 * @Version 1.0
 */
public interface Controller {
}
class HttpController implements Controller{
    public void doHttpHandler(){
        System.out.println("doHttpHandler...");
    }
}
class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("doSimpleHandler...");
    }
}
class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("doAnnotationHandler...");
    }
}