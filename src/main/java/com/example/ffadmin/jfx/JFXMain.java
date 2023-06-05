package com.example.ffadmin.jfx;

import com.example.ffadmin.FfAdminApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class JFXMain extends Application {
    private ConfigurableApplicationContext context;

    @Override
    public void init(){
        context = new SpringApplicationBuilder(FfAdminApplication.class).run();
    }

    @Override
    public void stop(){
        context.close();
        Platform.exit();
    }

    @Override
    public void start(Stage stage) throws Exception {
        context.publishEvent(new StageReadyEvent(stage));
        System.out.println("suys");
    }

     public static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

         public Stage getStage() {
            return (Stage) getSource();
         }
     }
}
