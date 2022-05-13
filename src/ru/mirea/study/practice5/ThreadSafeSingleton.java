package ru.mirea.study.practice5;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}