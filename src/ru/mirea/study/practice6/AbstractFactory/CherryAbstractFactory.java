package ru.mirea.study.practice6.AbstractFactory;

public class CherryAbstractFactory implements AbstractFactory{
    @Override
    public Cookie createCookie() {
        return new CherryCookie();
    }

    @Override
    public Doughnut createDoughnut() {
        return new CherryDoughnut();
    }
}
