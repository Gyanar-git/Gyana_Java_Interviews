package com.interviews.rakuten;

public class MyOddEvenThread {
    private int num=1;
    private int n;

    public MyOddEvenThread(int n) {
        this.n = n;
    }

    public synchronized void printEven() throws InterruptedException {
        while (num <= n){
            if(num %2 == 0){
                System.out.println("My thread printing even" +num);
                num++;
                notifyAll();
            }else{
                wait();
            }
        }
    }

    public synchronized void printOdd() throws InterruptedException {
        while (num <= n){
            if(num %2 != 0){
                System.out.println("My thread printing odd" +num);
                num++;
                notifyAll();
            }else{
                wait();
            }
        }
    }

    public static void main(String[] args) {
        MyOddEvenThread m1 = new MyOddEvenThread(5);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    m1.printEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    m1.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();


    }
}
