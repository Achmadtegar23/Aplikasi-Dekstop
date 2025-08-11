package com.example.uaspbo.controller;

import com.example.uaspbo.entity.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.stream.Collectors;

public class DashboardController {

    private User selectedUser;

    @FXML
    private Button btnClients;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnReports;

    @FXML
    private Button btnServices;

    @FXML
    private Button btnSuppliers;

    @FXML
    private Button btnUDelete;

    @FXML
    private Button btnUNew;

    @FXML
    private Button btnUSave;

    @FXML
    private Button btnUUpdate;

    @FXML
    private Button btnUsers;

    @FXML
    private TableView<User> tblUser;

    @FXML
    private TableColumn<User, String> colURole;

    @FXML
    private TableColumn<User, Long> colUId;

    @FXML
    private TableColumn<User, String> colUUsername;

    @FXML
    private MenuButton mbURole;

    @FXML
    private PasswordField txUPassword;

    @FXML
    private TextField txUUsername;

    @FXML
    private TextField txUid;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    @FXML
    private void initialize() {
        colUId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colURole.setCellValueFactory(new PropertyValueFactory<>("role"));

        tblUser.setOnMouseClicked(event -> {
            User user = tblUser.getSelectionModel().getSelectedItem();
            if (user != null) {
                selectedUser = user;
            }
        });

        ObservableList<MenuItem> roles = FXCollections.observableArrayList("admin", "user").stream()
                .map(role -> {
                    MenuItem item = new MenuItem(role);
                    item.setOnAction(event -> mbURole.setText(role));
                    return item;
                }).collect(Collectors.toCollection(FXCollections::observableArrayList));

        mbURole.getItems().addAll(roles);
    }

}
