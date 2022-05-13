package ru.mirea.study.practice6.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ChocolateAbstractFactory();
        AbstractFactory factory2 = new CherryAbstractFactory();

        System.out.println(factory1.createCookie());
        System.out.println(factory1.createCookie());

        System.out.println(factory2.createCookie());
        System.out.println(factory2.createDoughnut());
    }
}
