package ru.mirea.study.practice4;

/**
 * Реализовать собственную имплементацию ExecutorService с единственным параметром конструктора – количеством потоков.
 */


public class Main {
    public static void main(String[] args) {
        int count = 3;
        MyExecutorService executor = new MyExecutorService(count);

        for (int i = 0; i < 5; i++) {
            Runnable worker = new MyyRunnable("Task" + i);
            executor.execute(worker);
        }
        executor.shutdown();
    }
}
