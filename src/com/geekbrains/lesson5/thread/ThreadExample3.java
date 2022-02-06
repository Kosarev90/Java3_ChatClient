package com.geekbrains.lesson5.thread;

public class ThreadExample3 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start for main");

        MyThread thread1 = new MyThread("Поток - 1");
        thread1.start();


//        thread1.join();
        while (thread1.isAlive()) {
            Thread.sleep(3000);
        }

        System.out.println("End for main");
    }
}
