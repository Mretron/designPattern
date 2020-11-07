package com.zzj.designPattern.structural.combinationPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;

    /**
     * 下属
     */
    private List<Employee> subordinates;

    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
