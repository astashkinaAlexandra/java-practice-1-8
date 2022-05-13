package ru.mirea.study.practice7.Bridge;

public abstract class Shape {
    protected Drawer drawer;

    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();
}