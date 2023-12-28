package _04_autowire;

import _02_car.Engine;

public class AutoCar {
    private int id;
    private String model;
    private Engine engine;

    public AutoCar(Engine engine) {
        this.engine = engine;
    }
}
