package com.jolyoulu.principle.ocp.improve;

/**
 * @Author: LZJ
 * @Date: 2020/8/30 16:35
 * @Version 1.0
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type =1;
    }

    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type =2;
    }

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}