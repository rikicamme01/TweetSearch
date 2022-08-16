module com.example.tweetsearch {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    opens com.example.tweetsearch to javafx.fxml;
    exports com.example.tweetsearch;
}