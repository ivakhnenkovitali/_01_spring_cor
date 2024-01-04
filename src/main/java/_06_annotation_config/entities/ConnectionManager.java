package _06_annotation_config.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConnectionManager {
    private ConnectionManager connectionManager;
@Autowired
    public ConnectionManager getConnectionManager() {
        return connectionManager;
    }

    @Override
    public String toString() {
        return "Connection manager obj";
    }
}
