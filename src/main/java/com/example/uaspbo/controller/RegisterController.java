package com.example.uaspbo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class RegisterController {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button registerButton;
    @FXML
    private AnchorPane registerPane;

    // Metode untuk mendaftar dan kembali ke halaman login
    public void register() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Logika pendaftaran (misalnya menyimpan ke database, dll.)
        // Di sini, kita hanya memberikan konfirmasi untuk simulasi
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Registration Successful");
        alert.setHeaderText(null);
        alert.setContentText("Akun berhasil dibuat!");
        alert.showAndWait();

        // Kembali ke halaman login setelah pendaftaran berhasil
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Stage stage = (Stage) registerPane.getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
    }
}
