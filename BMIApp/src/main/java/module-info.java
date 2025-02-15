module com.dnd.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dnd.bmiapp to javafx.fxml;
    exports com.dnd.bmiapp;
}
