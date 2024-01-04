package _06_annotation_config.entities;


import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {
    @Override
    public String toString() {
        return "Connection manager obj";
    }
}
