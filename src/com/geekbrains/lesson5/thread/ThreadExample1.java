package com.geekbrains.lesson5.thread;

public class ThreadExample1 {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Custom thread 1");
        MyThread thread2 = new MyThread("Custom thread 2");
//        thread1.start();
//        thread2.start();
        thread1.run();
        thread2.run();
    }
}
