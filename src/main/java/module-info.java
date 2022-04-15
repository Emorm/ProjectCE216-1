module com.ce216.projectce216 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ce216.projectce216 to javafx.fxml;
    exports com.ce216.projectce216;
}