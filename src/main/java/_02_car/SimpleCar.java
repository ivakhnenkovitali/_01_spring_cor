package _02_car;

public class SimpleCar {
    private int id;
    private String model;



    public SimpleCar() {
        model = "model";
    }

    public SimpleCar(String model) {
        this.model = model;
    }

    public SimpleCar(String model, int id) {
        this.id = id;
        this.model = model;
    }


}
