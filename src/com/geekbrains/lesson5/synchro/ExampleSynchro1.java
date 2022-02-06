package com.geekbrains.lesson5.synchro;

public class ExampleSynchro1 {

    public static void main(String[] args) {
        ExampleSynchro1 exampleSynchro1 = new ExampleSynchro1();

        System.out.println("START everything");

        new Thread(exampleSynchro1::method1).start();
        new Thread(exampleSynchro1::method2).start();
    }

    public synchronized void method1() {
        System.out.println("Method 1 START !");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Method 1 STOP !");
    }

    public void method2() {
        synchronized (this) {
            System.out.println("Method 2 START !");

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Method 2 STOP !");
        }
    }
}
