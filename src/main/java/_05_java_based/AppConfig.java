package _05_java_based;

import _02_car.ComplexCar;
import _02_car.Engine;
import _02_car.SimpleCar;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public String message() {
        return "Hello IT... world!!!";
    }


    @Bean
   public SimpleCar car1(){
        return new SimpleCar();
   }
   @Bean
    public SimpleCar car2(){
        return new SimpleCar("BMV");
    }
    @Bean
    public Engine engine(){
        return new Engine("ECO");
    }
    @Bean
    public ComplexCar car3(){
        return new ComplexCar(engine());
    }
}
