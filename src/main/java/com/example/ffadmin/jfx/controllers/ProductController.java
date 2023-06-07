package com.example.ffadmin.jfx.controllers;

import com.example.ffadmin.restConsumer.controllers.RestProductController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
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
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/main-page.fxml"));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }

    public void OpenOrderPage(ActionEvent actionEvent) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/product-page.fxml"));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }

    public void openCategoryPage(ActionEvent actionEvent) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FXMLLoader fxmlLoader = new FXMLLoader(cl.getResource("templates/category-page.fxml"));
        // just why?
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene newScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(newScene);
    }
}
