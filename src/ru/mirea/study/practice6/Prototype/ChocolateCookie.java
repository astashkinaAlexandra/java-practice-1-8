package ru.mirea.study.practice6.Prototype;

public class ChocolateCookie extends CookiePrototype {
    private int radius;
    private int weight;

    public ChocolateCookie(int radius) {
        this.radius = radius;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public CookiePrototype clone() {
        ChocolateCookie cookie = new ChocolateCookie(radius);
        cookie.setWeight(this.getWeight());
        return cookie;
    }

    @Override
    public String toString() {
        return "ChocolateCookie{" +
                "radius=" + radius +
                ", weight=" + weight +
                '}';
    }
}
