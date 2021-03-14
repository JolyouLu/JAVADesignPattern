package com.jolyoulu.composite;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/13 18:06
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建学校
        OrganizationComponent university = new University("清华大学", "985学校");
        //创建学院
        College computerCollege = new College("计算机学院", "计算机学院");
        College infoEngineerCollege = new College("信息工程学院", "信息工程学院");
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //创建各个专业
        computerCollege.add(new Department("软件工程","学习软件开发"));
        computerCollege.add(new Department("网络工程","学习网络相关"));
        computerCollege.add(new Department("计算机与科学","计算机"));

        infoEngineerCollege.add(new Department("通信工程","通信工程"));
        infoEngineerCollege.add(new Department("信息工程","信息工程"));

        university.print();
    }
}
