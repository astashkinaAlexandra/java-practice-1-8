package ru.mirea.study.practice7.Bridge;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(new RedCircleDrawer()),
                new Circle(new GreenCircleDrawer())};
        for (Shape next : shapes) {
            next.draw();
        }
    }
}