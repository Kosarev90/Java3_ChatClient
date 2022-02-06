package com.geekbrains.lesson5.synchro;

public class ExampleSynchro2 {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        ExampleSynchro2 e1 = new ExampleSynchro2();
        ExampleSynchro2 e2 = new ExampleSynchro2();

        System.out.println("Start");

        new Thread(e1::method1).start();
        new Thread(e2::method1).start();
    }

    private void method1() {
        System.out.println(Thread.currentThread().getName() + ": Block-1 begin");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Block-1 end");

        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + ": Synch block begin");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Synch block end");
        }
    }
}
