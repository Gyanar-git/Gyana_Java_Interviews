package com.interviews.sap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String str = "Once up a time in one beautiful country there was a king, The King aged 25 went to war on other KING but once a glory kingdom had very less soldiers now so they failing in war is all but guaranteed";
        Map<String,Integer> wordCountMap= new HashMap<>();
        List<String> words = new ArrayList<>();
        String[] wordsByComma = str.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
        for(String w:wordsByComma){
            String[] split = w.split(" ");
            for(String s1 : split){
                words.add(s1);
            }

        }
        for(String word:words){
            Integer count = wordCountMap.get(word.toLowerCase());
            if(count == null){
                wordCountMap.put(word.toLowerCase(), 1);
            }else{
                wordCountMap.put(word.toLowerCase(), wordCountMap.get(word.toLowerCase()) +1);
            }


        }

        System.out.println("The count of words in the given senetence:" +wordCountMap.toString());



    }
}
