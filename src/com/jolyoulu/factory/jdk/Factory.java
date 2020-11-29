package com.jolyoulu.factory.jdk;

import java.util.Calendar;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 12:30
 * @Version 1.0
 */
public class Factory {
    public static void main(String[] args) {
        //getInstance 是 Calendar 的静态方法
        Calendar cal = Calendar.getInstance();
        System.out.println("年："+cal.get(Calendar.YEAR));
        System.out.println("月："+cal.get(Calendar.MONTH) + 1);
        System.out.println("日："+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时："+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分："+cal.get(Calendar.MINUTE));
        System.out.println("秒："+cal.get(Calendar.SECOND));
    }
}
