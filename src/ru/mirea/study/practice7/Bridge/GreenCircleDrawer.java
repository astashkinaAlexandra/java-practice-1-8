package ru.mirea.study.practice7.Bridge;

public class GreenCircleDrawer implements Drawer {
    @Override
    public void drawCircle() {
        System.out.println("green");
    }
}