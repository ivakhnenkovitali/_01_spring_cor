package _02_car;

import java.util.StringJoiner;

public class SimpleCar {
    private int id;
    private String model;


    public SimpleCar() {
        model = "Default model";   /// пустой конструктор
    }


    public SimpleCar(String model) {  //// с одним пораметром
        this.model = model;
    }

    public SimpleCar(int id, String model) {  ///// с двумя пораметрами
        this.id = id;
        this.model = model;
    }


    public SimpleCar(String model, int id) {   ////// с двумя пора-ми только меняем .... содержание наоборот
        this.id = id;
        this.model = model;
    }

    public int getId() {    /// гет сет
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override     //// тостринг
    public String toString() {
        return new StringJoiner(", ", SimpleCar.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model='" + model + "'")
                .toString();
    }
}
