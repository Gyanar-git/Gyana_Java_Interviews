package com.array;
import java.util.HashMap;
import java.util.Map;

public class ArrayTest {
    public static void main(String[] args) {
        Map<Integer,Integer> myMap = new HashMap<>();
        myMap.put(1,2);
        myMap.put(3,4);

        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            entry.getKey();
            entry.getValue();


        }

        Map<Integer,String> myMap1 = new HashMap<>();
        myMap1.put(123,"Gyan");
        myMap1.put(245,"Gyan");

        System.out.println("c:" +myMap1.toString());
    }
}
