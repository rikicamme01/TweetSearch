module com.example.twitter_api {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.example.twitter_api to javafx.fxml;
    exports com.example.twitter_api;
}