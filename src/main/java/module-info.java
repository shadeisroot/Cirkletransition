module com.example.cirkletransition {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cirkletransition to javafx.fxml;
    exports com.example.cirkletransition;
}