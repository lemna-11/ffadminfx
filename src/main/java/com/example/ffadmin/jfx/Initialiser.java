package com.example.ffadmin.jfx;

import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;

public class Initialiser implements ApplicationListener<JFXMain.StageReadyEvent> {
    @Override
    public void onApplicationEvent(JFXMain.StageReadyEvent event) {
        Stage stage = event.getStage();
    }
}
