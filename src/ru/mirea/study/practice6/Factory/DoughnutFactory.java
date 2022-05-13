package ru.mirea.study.practice6.Factory;

public class DoughnutFactory {
    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut doughnut = null;
        switch (type) {
            case ALMOND:
                doughnut = new AlmondDoughnut();
                break;
            case CHERRY:
                doughnut = new CherryDoughnut();
                break;
            case CHOCOLATE:
                doughnut = new ChocolateDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return doughnut;
    }
}
