package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    String name;
    int rollNo;

    StudentTest(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;

    }

    @Override
    public boolean equals(Object obj)
    {

        // if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        StudentTest student = (StudentTest) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (student.name.equals(this.name)  && student.rollNo == this.rollNo);
    }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.rollNo;
    }



    public static void main(String[] args) {
        StudentTest s1 = new StudentTest("Ashok",123);
        StudentTest s2 = new StudentTest("Ashok",123);
        if(s1.equals(s2)){
            System.out.println("Hello");

        }else{
            System.out.println("Hi");
        }

        Map<StudentTest,String> myMap = new HashMap<>();
        myMap.put(s1,"Gyan");
        myMap.put(s2,"sr");

        for(StudentTest studentTest: myMap.keySet()){
            System.out.println("Map content:" +myMap.get(studentTest).toString());

        }


    }




}
