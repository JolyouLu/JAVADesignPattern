package com.jolyoulu.iterator;

import com.jolyoulu.template.PenutSoyaMilk;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/4 23:10
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());

        //输出
        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
