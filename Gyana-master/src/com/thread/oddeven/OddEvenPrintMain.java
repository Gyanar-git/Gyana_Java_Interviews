package com.thread.oddeven;

public class OddEvenPrintMain {
    boolean odd;
    int count = 1;
    int MAX = 5;

    public void printOdd(){
        synchronized (this){
            while (count < MAX){
                System.out.println("Checking in Odd loop");
                while (!odd){
                    try{
                        System.out.println("Odd waiting....:" + count);
                        wait();
                        System.out.println("Notified Odd..:" +count);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd thread count:" +count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        synchronized (this){
            while (count < MAX){
                System.out.println("Checking in Even loop");
                while (odd){
                    try{
                        System.out.println("Even waiting....:" + count);
                        wait();
                        System.out.println("Notified Even..:" +count);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread count:" +count);
                count++;
                odd = true;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenPrintMain oddEvenPrintMain = new OddEvenPrintMain();
        oddEvenPrintMain.odd = true;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrintMain.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenPrintMain.printOdd();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
