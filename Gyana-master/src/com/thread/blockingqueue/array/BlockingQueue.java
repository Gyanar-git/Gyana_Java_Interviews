package com.thread.blockingqueue.array;

public class BlockingQueue<T> {

    T[] array;
    Object lock = new Object();
    int size = 0;
    int capacity;
    int head = 0;
    int tail = 0;

    @SuppressWarnings("unchecked")
    public BlockingQueue(int capacity) {
        // The casting results in a warning
        array = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public void enqueue(T item) throws InterruptedException {

        synchronized (lock) {

            // wait for queue to have space
            while (size == capacity) {
                lock.wait();
            }

            // reset tail to the beginning if the tail is already
            // at the end of the backing array
            if (tail == capacity) {
                tail = 0;
            }

            // place the item in the array
            array[tail] = item;
            size++;
            tail++;

            // don't forget to notify any other threads waiting on
            // a change in value of size. There might be consumers
            // waiting for the queue to have atleast one element
            lock.notifyAll();
        }
    }

    public T dequeue() throws InterruptedException {

        T item = null;
        synchronized (lock) {

            while (size == 0) {
                lock.wait();
            }

            if (head == capacity) {
                head = 0;
            }

            item = array[head];
            array[head] = null;
            head++;
            size--;

            lock.notifyAll();
        }

        return item;
    }
}
