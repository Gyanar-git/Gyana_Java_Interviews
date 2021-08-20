package com.thread.lock;

public class MyCounter {
    private int count = 0;

    public synchronized void add(int val){
        this.count += val;
    }
    public synchronized void sub(int val){
        this.count -= val;
    }
}
