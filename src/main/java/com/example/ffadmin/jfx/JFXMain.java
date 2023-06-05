package com.example.ffadmin.jfx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ConfigurableApplicationContext;

public class JFXMain extends Application {
    private ConfigurableApplicationContext context;

    @Override
    public void start(Stage stage) throws Exception {
        context.publishEvent(new StageReadyEvent(stage));
        System.out.println("suys");
    }
}
