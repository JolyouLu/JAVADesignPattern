package com.jolyoulu.principle.ocp;

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
        if (s.m_type == 1){
            drawRectangle(s);
        }else if (s.m_type == 2){
            drawCircle(s);
        }
    }
    public void drawRectangle(Shape r){
        System.out.println("画矩形");
    }

    public void drawCircle(Shape r){
        System.out.println("画圆形");
    }
}
class Shape{
    int m_type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.m_type =1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type =2;
    }
}