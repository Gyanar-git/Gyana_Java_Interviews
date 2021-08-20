package com.interviews.rakuten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Solution {
    ArrayList<Integer> myArr = new ArrayList<>();
    HashMap<Integer,Integer> myMap = new HashMap<>();


    void add(int a){
        if(myMap.get(a) != null){
            return;
        }else{
            int x = myArr.size();
            myArr.add(a);
            myMap.put(a,x);
        }

    }

    int getRandom(){
        Random random = new Random();
        int index = random.nextInt(myArr.size());
        return myArr.get(index);
    }

    void delete(int a){
        Integer indexPos = myMap.get(a);
        if(indexPos == null){
            return;
        }else{
            myMap.remove(a);
        }
        int length = myArr.size();
        int last = myArr.get(length-1);

        Collections.swap(myArr,indexPos,length-1);
        myArr.remove(length-1);

        myMap.put(last,indexPos);


    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.add(10);
        solution.add(15);
        solution.add(15);
        solution.add(20);
        solution.add(25);

        System.out.println("Get random1:" +solution.getRandom());
        System.out.println("Get random2:" +solution.getRandom());
        System.out.println("Get random3:" +solution.getRandom());



        solution.delete(15);

        System.out.println("My data structure size after deleting 15" +solution.myArr.size());

        System.out.println("Get random1 after removal of 15:" +solution.getRandom());
        System.out.println("Get random2 after removal of 15 :" +solution.getRandom());
        System.out.println("Get random3 after removal of 15:" +solution.getRandom());

        solution.delete(25);

        System.out.println("My data structure size after deleting 25" +solution.myArr.size());

        System.out.println("Get random1: after removal of 25" +solution.getRandom());
        System.out.println("Get random2: after removal of 25 " +solution.getRandom());
        System.out.println("Get random3: after removal of 25" +solution.getRandom());




    }

}
