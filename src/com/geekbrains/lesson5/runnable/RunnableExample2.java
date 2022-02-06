package com.geekbrains.lesson5.runnable;

public class RunnableExample2 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable2(100));
        Thread thread2 = new Thread(new MyRunnable2(1000));
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}
