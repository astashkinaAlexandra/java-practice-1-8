package ru.mirea.study.practice7.Bridge;

public class Circle extends Shape {
    private String color;

    public Circle(Drawer drawer) {
        super(drawer);
    }

    @Override
    public void draw() {
        drawer.drawCircle();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}