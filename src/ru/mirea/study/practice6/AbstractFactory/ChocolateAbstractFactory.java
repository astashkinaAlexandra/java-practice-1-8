package ru.mirea.study.practice6.AbstractFactory;

public class ChocolateAbstractFactory implements AbstractFactory{
    @Override
    public Cookie createCookie() {
        return new ChocolateCookie();
    }

    @Override
    public Doughnut createDoughnut() {
        return new ChocolateDoughnut();
    }
}
