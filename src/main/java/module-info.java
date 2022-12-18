module com.example.cafebelgam {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires javafx.graphics;
    requires javafx.base;
    requires java.naming;
    requires java.sql;
    requires java.xml;
    requires jakarta.persistence;


    opens com.example.cafebelgam to javafx.fxml;
    exports com.example.cafebelgam;
}