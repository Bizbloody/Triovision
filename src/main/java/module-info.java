module com.example.triovision2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.triovision2 to javafx.fxml;
    exports com.example.triovision2;
}