package com.geekbrains.lesson5.thread;

public class ThreadExample2 {

    public static void main(String[] args) {
        MyThreadPriority thread1 = new MyThreadPriority();
        thread1.setPriority(1);

        Thread.currentThread().setPriority(7);
        MyThreadPriority thread2 = new MyThreadPriority();

        thread1.start();
        thread2.start();
    }
}
