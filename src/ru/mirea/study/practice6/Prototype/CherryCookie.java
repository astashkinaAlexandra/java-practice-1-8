package ru.mirea.study.practice6.Prototype;

public class CherryCookie extends CookiePrototype {
    private int radius;
    private int weight;

    public CherryCookie(int radius) {
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
        CherryCookie cookie = new CherryCookie(radius);
        cookie.setWeight(this.getWeight());
        return cookie;
    }

    @Override
    public String toString() {
        return "CherryCookie{" +
                "radius=" + radius +
                ", weight=" + weight +
                '}';
    }
}
