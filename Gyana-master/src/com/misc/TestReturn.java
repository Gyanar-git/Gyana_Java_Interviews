package com.misc;

public class TestReturn {
    public static void main(String[] args) {
        int i = 5;
        //fact(i);


        int test = 3;
        printFun(test);


    }

    static int fact(int n)
    {
        if (n <= 1) // base case
            return 1;
        else
            return n*fact(n-1);
    }

    static void printFun(int test)
    {
        if (test < 1)
            return;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1); // statement 2
            System.out.printf("%d ", test);
            return;
        }
    }
}
