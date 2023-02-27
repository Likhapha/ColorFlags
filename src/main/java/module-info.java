module com.example.colorflags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colorflags to javafx.fxml;
    exports com.example.colorflags;
}