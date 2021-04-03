package com.jolyoulu.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:35
 * @Version 1.0
 */
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void attache(Person p){
        persons.add(p);
    }

    //移除
    public void detach(Person p){
        persons.remove(p);
    }

    //显示测评情况
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
