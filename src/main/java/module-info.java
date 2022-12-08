module com.example.cafebelgam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cafebelgam to javafx.fxml;
    exports com.example.cafebelgam;
}