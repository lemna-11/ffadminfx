package com.example.ffadmin.jfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    public GridPane MainGrid;

    @FXML
    public void openProductPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/product-page.fxml");
    }

    @FXML
    public void openOrderPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/order-page.fxml");
    }

    @FXML
    public void OpenCategoriesPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/category-page.fxml");
    }

    @FXML
    public void exitApp(ActionEvent actionEvent) {
        System.exit(0);
    }


}