package com.jolyoulu.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LZJ
 * @Date: 2020/8/30 17:34
 * @Version 1.0
 */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManger schoolManger = new SchoolManger();
        schoolManger.printAllEmployee(new CollegeManger());
    }
}

class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManger{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工ID="+i);
            list.add(emp);
        }
        return list;
    }
    void printEmployee(){
        List<CollegeEmployee> list1 = this.getAllEmployee();
        System.out.println("===============分公司员工=================");
        for (CollegeEmployee collegeEmployee : list1) {
            System.out.println(collegeEmployee.getId());
        }
    }
}

class SchoolManger{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id="+i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManger sub){
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("===============学校总部员工=================");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }
    }
}