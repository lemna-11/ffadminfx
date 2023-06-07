package com.example.ffadmin.jfx;

import com.example.ffadmin.FfAdminApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

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
    public void start(Stage stage) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/main-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Admin App");
        stage.setScene(scene);
        stage.show();
        context.publishEvent(new StageReadyEvent(stage));
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
