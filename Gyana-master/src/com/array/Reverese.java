package com.array;

import org.w3c.dom.ls.LSOutput;

public class Reverese {
    public static void main(String[] args) {
       int a[] = {1,2,3,4,5};
       int b[] = new int[5];
       int j = a.length;
        for (int i = 0; i < a.length; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }

        for(int k = 0; k< b.length ;k++){
            System.out.println("Arr-" +b[k]);

        }
        }



}
