package ru.mirea.study.practice5;

/**
 * Реализовать Singleton тремя способами.
 */


public class Main {
    public static void main(String[] args) {
        // независимо от количества вызовов хэш-код экземпляра класса один и тот же
        System.out.println(EagerInitializedSingleton.getInstance());
        System.out.println(EagerInitializedSingleton.getInstance());

        System.out.println(LazyInitializedSingleton.getInstance());
        System.out.println(LazyInitializedSingleton.getInstance());

        System.out.println(ThreadSafeSingleton.getInstance());
        System.out.println(ThreadSafeSingleton.getInstance());
    }
}
