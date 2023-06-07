package com.example.ffadmin.jfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    public GridPane MainGrid;

    @FXML
    public void openProductPage(ActionEvent actionEvent) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/product-page.fxml"));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }

    @FXML
    public void openOrdersPage(ActionEvent actionEvent) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/orders-page.fxml"));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }

    @FXML
    public void OpenCategoriesPage(ActionEvent actionEvent) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/categories-page.fxml"));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }

    @FXML
    public void exitApp(ActionEvent actionEvent) {
        System.exit(0);
    }
}