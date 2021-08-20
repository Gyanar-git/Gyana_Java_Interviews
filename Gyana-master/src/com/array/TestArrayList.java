package com.array;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        for(int i = 0 ; i < myList.size() ;i++){
            System.out.println("Elemenet:" +myList.get(i));
            continue;
        }



    }
}
