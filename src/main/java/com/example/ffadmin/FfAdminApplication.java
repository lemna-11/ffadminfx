package com.example.ffadmin;

import com.example.ffadmin.jfx.JFXMain;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FfAdminApplication {

    public static void main(String[] args) {
        Application.launch(JFXMain.class, args);
    }

}
