package com.example.ffadmin.jfx.controllers;


import com.example.ffadmin.restConsumer.controllers.RestCategoryController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class CategoryController {
    @FXML
    public TextField categoryName;
    @FXML
    public TextField catid;

    public RestCategoryController categoryController;



    public void addCategory(ActionEvent actionEvent) {
        categoryController.addCategory(categoryName.getText(), Long.parseLong(catid.getText()));
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
