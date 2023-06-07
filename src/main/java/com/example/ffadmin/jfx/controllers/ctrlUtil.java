package com.example.ffadmin.jfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.experimental.UtilityClass;

import java.io.IOException;

@UtilityClass
public class ctrlUtil {
    public static void reroute(ActionEvent actionEvent, String route) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource(route));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }
}
