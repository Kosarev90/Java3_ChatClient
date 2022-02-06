package com.geekbrains.lesson5.thread;

public class MyThreadWithFlag extends Thread {

    private boolean stopped = false;

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Поток был завершен");
                    break;
                }
                Thread.sleep(500);
                System.out.printf("%s: %d%n", Thread.currentThread().getName(), i);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
