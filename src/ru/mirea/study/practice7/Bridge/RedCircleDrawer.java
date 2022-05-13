package ru.mirea.study.practice7.Bridge;

public class RedCircleDrawer implements Drawer {
    @Override
    public void drawCircle() {
        System.out.println("red");
    }
}