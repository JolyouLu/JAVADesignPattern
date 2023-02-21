package com.jolyoulu.principle.inversion;

/**
 * @Author: LZJ
 * @Date: 2020/8/30 14:56
 * @Version 1.0
 */
public class DependencyPass {
    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new TCL());
        openAndClose.open();

        openAndClose.setTv(new MeiDi());
        openAndClose.open();
    }
}

/**
 * 方式1：通过接口传递实现依赖
 */
//interface ITV{
//    public void play();
//}
//interface IOpenAndClose{
//    public void open(ITV itv);
//}
//class TCL implements ITV{
//    @Override
//    public void play() {
//        System.out.println("打开TCL电视");
//    }
//}
//class MeiDi implements ITV{
//    @Override
//    public void play() {
//        System.out.println("打开美的电视");
//    }
//}
//class OpenAndClose implements IOpenAndClose{
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}
/**
 * 方式2：通过构造方法传递实现依赖
 */
//interface ITV{
//    public void play();
//}
//interface IOpenAndClose{
//    public void open();
//}
//class TCL implements ITV{
//    @Override
//    public void play() {
//        System.out.println("打开TCL电视");
//    }
//}
//class MeiDi implements ITV{
//    @Override
//    public void play() {
//        System.out.println("打开美的电视");
//    }
//}
//class OpenAndClose implements IOpenAndClose{
//    private ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open(){
//        this.tv.play();
//    }
//}
/**
 * 方式3：通过setter方法传递实现依赖
 */
interface ITV{
    public void play();
}
interface IOpenAndClose{
    public void open();
    public void setTv(ITV itv);
}
class TCL implements ITV{
    @Override
    public void play() {
        System.out.println("打开TCL电视");
    }
}
class MeiDi implements ITV{
    @Override
    public void play() {
        System.out.println("打开美的电视");
    }
}
class OpenAndClose implements IOpenAndClose{
    private ITV tv;
    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV itv) {
        this.tv=itv;
    }
}
