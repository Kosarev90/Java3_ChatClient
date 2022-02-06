package com.geekbrains.lesson5.thread;

public class ThreadExample4 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start for main");
        MyThreadWithFlag thread1 = new MyThreadWithFlag();
        thread1.start();

        Thread.sleep(2000);
//        thread1.setStopped(true);
        thread1.interrupt();
        thread1.join();

        System.out.println("Stop for main");
    }
}
