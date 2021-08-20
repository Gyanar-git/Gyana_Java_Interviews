package com.thread.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MutiThreading implements Runnable{
    private static int counter = 0;
    private final int limit = 10;
    private final int threadPoolSize = 5;
    private final Object lock = new Object();

    //ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (counter < limit){
            increaseCounter();
        }
    }

    private void increaseCounter() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            counter++;
        }

//        lock.lock();
//        try {
//            System.out.println(Thread.currentThread().getName() + " : " + counter);
//            counter++;
//        }finally {
//            lock.unlock();
//        }

    }


}
