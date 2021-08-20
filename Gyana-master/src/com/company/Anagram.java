package com.company;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
	// write your code here

        String[] str = {"act","tca","ate","tea","ac","bb"};
        Collection<List<String>> lists = GroupAnagrams(Arrays.asList(str.clone()));
        System.out.println("The Anagram words are" +lists.toString());


    }

    public static Collection<List<String>> GroupAnagrams(List<String> words){
        final HashMap<String,List<String>> map = new HashMap<>();
        words.forEach((String word ) -> {
            String key = sort(word);
            if (map.containsKey(key))
                map.get(key).add(word);
            else
                map.put(key , new LinkedList<>(Arrays.asList(new String[]{word})));
        });
        return map.values();
    }


    private static String sort(String str){
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}
