package _01_base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("01_helloworld.xml");
        ///
        var message = ctx.getBean("message", String.class);
        System.out.println(message);
    }
}
///предоставляет комплексную модель