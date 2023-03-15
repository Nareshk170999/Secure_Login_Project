module sample.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens sample.login to javafx.fxml;
    exports sample.login;
}