package com.geekbrains.lesson5.racecondition;

public class RaceCondition1 {

    private volatile static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Имя текущего потока " + Thread.currentThread().getName());
//        printCount();
//        printCount();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                RaceCondition1.printCount();
            }
        }, "T1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                RaceCondition1.printCount();
            }
        }, "T2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Финальное значение переменной count = " + count);
    }

    private /*synchronized*/ static void printCount() {
        for (int i = 0; i < 100; i++) {
//            count++;
            System.out.println("Привет из потока " + Thread.currentThread().getName());
            synchronized (RaceCondition1.class) {
                System.out.println(Thread.currentThread().getName() + ": " + count++);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
