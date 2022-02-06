package com.geekbrains.lesson5.runnable;

public class MyRunnable2 implements Runnable {

    private final int delay;

    public MyRunnable2(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(this.delay);
                System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
