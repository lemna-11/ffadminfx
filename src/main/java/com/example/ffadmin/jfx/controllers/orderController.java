package com.example.ffadmin.jfx.controllers;


import com.example.ffadmin.restConsumer.controllers.RestProductController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

@Controller
public class orderController {
    @FXML public static TextField status;
    @FXML public static TextField ordid;

    private final RestProductController orderController;

    public orderController(){
        orderController = new RestProductController();
    }

    public static void openOrder(ActionEvent actionEvent) {
        ProductController.openOrder(status.getText(), ordid.getText());
    }

    public void returnToMainPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/main-page.fxml");
    }

    public void OpenOrderPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/order-page.fxml");
    }

    public void openCategoryPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent, "templates/category-page.fxml");
    }

    public void openProductPage(ActionEvent actionEvent) throws IOException {
        ctrlUtil.reroute(actionEvent,"templates/product-page.fxml" );
    }


}
