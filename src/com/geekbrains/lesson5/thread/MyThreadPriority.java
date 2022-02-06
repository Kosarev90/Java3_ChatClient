package com.geekbrains.lesson5.thread;

public class MyThreadPriority extends Thread {

    @Override
    public void run() {
        System.out.printf("Поток %s начал свою работу с приоритетом %d%n",
                Thread.currentThread().getName(),
                Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Поток %s завершил свою работу", Thread.currentThread().getName());
    }
}
