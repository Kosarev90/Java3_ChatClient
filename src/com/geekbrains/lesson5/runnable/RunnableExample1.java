package com.geekbrains.lesson5.runnable;

public class RunnableExample1 {

    public static void main(String[] args) {
//        Thread thread = new Thread(new MyRunnable2(1000));
//        thread.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(300);
                    System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread2.start();

    }
}
