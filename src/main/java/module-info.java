module com.example.f23comp1011s2w2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.f23comp1011s2w2 to javafx.fxml;
    exports com.example.f23comp1011s2w2;
}