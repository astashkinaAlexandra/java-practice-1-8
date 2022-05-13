package ru.mirea.study.practice6.Prototype;

import java.util.Scanner;

public class Main {
//    public static boolean assertEquals(int weight, int anotherWeight) {
//        return weight == anotherWeight;
//    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a weight for cookie >> ");
        int radius = console.nextInt();
        System.out.println("Enter a radius for cookie >> ");
        int weight = console.nextInt();
        System.out.println("Enter a weight for cookie clone >> ");
        int anotherWeight = console.nextInt();

        ChocolateCookie cookie = new ChocolateCookie(radius);
        cookie.setWeight(weight);
        ChocolateCookie anotherCookie = (ChocolateCookie) cookie.clone();
        anotherCookie.setWeight(anotherWeight);

        // Шоколадная печенька была клонирована, и значение ее веса поменялось
        System.out.println(cookie);
        System.out.println(anotherCookie);
    }
}
