module com.example.uaspbo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.uaspbo to javafx.fxml;
    exports com.example.uaspbo;
    exports com.example.uaspbo.controller;
    opens com.example.uaspbo.controller to javafx.fxml;
    exports com.example.uaspbo.util;
    opens com.example.uaspbo.util to javafx.fxml;
}