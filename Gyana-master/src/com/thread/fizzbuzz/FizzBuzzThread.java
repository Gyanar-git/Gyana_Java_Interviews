package com.thread.fizzbuzz;

public class FizzBuzzThread {

    MultithreadedFizzBuzz obj;
    String method;

    public FizzBuzzThread(MultithreadedFizzBuzz obj, String method){
        this.obj = obj;
        this.method = method;
    }

    public void run() {
        if ("Fizz".equals(method)) {
            try {
                obj.fizz();
            }
            catch (Exception e) {
            }
        }
        else if ("Buzz".equals(method)) {
            try {
                obj.buzz();
            }
            catch (Exception e) {
            }
        }
        else if ("FizzBuzz".equals(method)) {
            try {
                obj.fizzbuzz();
            }
            catch (Exception e) {
            }
        }
        else if ("Number".equals(method)) {
            try {
                obj.number();
            }
            catch (Exception e) {
            }
        }

    }
}
