package com.thread.lock;

public class Main {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);
//        for(int i = 0 ; i < threadPoolSize ; i++){
//            executorService.submit(new MutiThreading());
//        }
//        executorService.shutdown();

        Thread t1 = new Thread(new MutiThreading());
        t1.start();

        Thread t2 = new Thread(new MutiThreading());
        t2.start();
    }
}
