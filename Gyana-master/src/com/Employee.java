package com;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    int id;
    String empName;

    public Employee(int id, String empName) {
        this.id = id;
        this.empName = empName;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Gyan");
        Employee e2 = new Employee(123,"Gyan");
        if(e1.equals(e2)){
            System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }

        Map<Employee, String> myMap = new HashMap<>();
        myMap.put(e1,"CSE");
        myMap.put(e2,"IT");

        for(Employee e : myMap.keySet()){
            System.out.println("Content of my map:" +myMap.get(e).toString());

        }

    }
}
