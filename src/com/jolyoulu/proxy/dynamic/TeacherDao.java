package com.jolyoulu.proxy.dynamic;

import com.jolyoulu.proxy.dynamic.ITeacherDao;

/**
 * @Author: JolyouLu
 * @Date: 2020/11/22 14:11
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中。。。。");
    }
}
