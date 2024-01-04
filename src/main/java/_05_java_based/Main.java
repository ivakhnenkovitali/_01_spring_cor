package _05_java_based;

import _02_car.ComplexCar;
import _02_car.SimpleCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(ctx.getBean("message", String.class));

        var car1 = ctx.getBean("car1", SimpleCar.class);
        var car2 = ctx.getBean("car2", SimpleCar.class);
        var car3 = ctx.getBean("car3", ComplexCar.class);

        var cars = Arrays.asList(car1, car2, car3);
        cars.forEach(System.out::println);
    }
}
