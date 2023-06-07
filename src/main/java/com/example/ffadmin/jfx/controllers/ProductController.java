package com.example.ffadmin.jfx.controllers;

import com.example.ffadmin.restConsumer.controllers.RestProductController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class ProductController {
    @FXML
    public TextField nameField;
    @FXML
    public TextField category;
    @FXML
    public TextField price;

    @Autowired
    private RestProductController productController;

    @FXML
    public void addProduct(ActionEvent actionEvent) {
        productController.addProduct(nameField.getText(), category.getText(), Long.parseLong(price.getText()));
    }

    public void returnToMainPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/main-page.fxml");
    }

    public void OpenOrderPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/orders-page.fxml");
    }

    public void openCategoryPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/category-page.fxml");
    }
}
