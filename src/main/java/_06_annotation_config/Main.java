package _06_annotation_config;

import _06_annotation_config.entities.ConnectionManager;
import _06_annotation_config.entities.Controller;
import _06_annotation_config.entities.Dao;
import _06_annotation_config.entities.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // var ctx = new AnnotationConfigApplicationContext(ConnectionManager.class, Dao.class, Service.class, Controller.class);
        var ctx = new AnnotationConfigApplicationContext("_06_annotation_config.entities");

        var cm = ctx.getBean(ConnectionManager.class);
        var dao = ctx.getBean(Dao.class);
        var service = ctx.getBean(Service.class);
        var controller = ctx.getBean(Controller.class);

        System.out.println(cm);
        System.out.println(dao);
        System.out.println(service);
        System.out.println(controller);
    }

}
