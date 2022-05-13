package ru.mirea.study.practice4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyyRunnable implements Runnable {
    private final String task;

    MyyRunnable(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Executing " + task + " with " + Thread.currentThread().getName());
        }
        System.out.println();
    }
}

public class Exec2 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            Runnable worker = new MyyRunnable("Task" + i);
            executor.execute(worker);
        }
        executor.shutdown();
    }
}
