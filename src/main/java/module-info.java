module com.example.armstrongapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.armstrongapplication to javafx.fxml;
    exports com.example.armstrongapplication;
}