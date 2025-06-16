module com.example.otromas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.otromas to javafx.fxml;
    exports com.example.otromas;
}