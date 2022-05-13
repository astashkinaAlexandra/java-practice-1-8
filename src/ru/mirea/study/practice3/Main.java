package ru.mirea.study.practice3;

import java.util.*;

/**
 * Map с использованием Semaphore, List с использованием Lock.
 */


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--Map using Semaphore--");

        Map<Integer, String> map = new HashMap<>();
        MyMap myMap = new MyMap();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                map.put(i, "i = " + i);
                myMap.put(i, "i = " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 5000; i < 10000; i++) {
                map.put(i, "i = " + i);
                myMap.put(i, "i = " + i);
            }
        });

        thread1.start();
        thread2.start();
        Thread.sleep(3000);

        System.out.println("Set size = " + map.size());
        System.out.println("MySet size = " + myMap.size());

        System.out.println("contains i = 1 " + map.containsValue("i = " + 1));
        System.out.println("contains i = 1 " + myMap.containsValue("i = " + 1));

        map.remove(1);
        myMap.remove(1);

        System.out.println("After removing key = 1 " + map.get(1));
        System.out.println("After removing key = 1 " + myMap.get(1));


        System.out.println("--List using Lock--");

        List<String> arrayList = new ArrayList<>();
        MyList myList = new MyList();

        Thread thread11 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                arrayList.add("i + " + i);
                myList.add("i + " + i);
            }
        });

        Thread thread12 = new Thread(() -> {
            for (int i = 5000; i < 10000; i++) {
                arrayList.add("i = " + i);
                myList.add("i = " + i);
            }
        });

        thread11.start();
        thread12.start();
        Thread.sleep(3000);

        System.out.println("List count = " + arrayList.size());
        System.out.println("MyList count = " + myList.size());

        System.out.println(arrayList.subList(4, 10));
        System.out.println(myList.subList(4, 10));
    }
}