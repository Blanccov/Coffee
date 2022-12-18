package com.example.cafebelgam;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class dashboardController implements Initializable {

    @FXML
    private Button close;

    @FXML
    private Button coupons_add;

    @FXML
    private Button coupons_btn;

    @FXML
    private Button coupons_clear;

    @FXML
    private TableColumn<?, ?> coupons_col_couponID;

    @FXML
    private TableColumn<?, ?> coupons_col_couponName;

    @FXML
    private TableColumn<?, ?> coupons_col_price;

    @FXML
    private TableColumn<?, ?> coupons_col_productName;

    @FXML
    private TableColumn<?, ?> coupons_col_status;

    @FXML
    private TextField coupons_couponID;

    @FXML
    private TextField coupons_couponName;

    @FXML
    private Button coupons_delete;

    @FXML
    private AnchorPane coupons_form;

    @FXML
    private TextField coupons_price;

    @FXML
    private ComboBox<?> coupons_productType;

    @FXML
    private TextField coupons_search;

    @FXML
    private ComboBox<?> coupons_status;

    @FXML
    private TableView<?> coupons_tableView;

    @FXML
    private Button coupons_update;

    @FXML
    private Button customers_btn;

    @FXML
    private TableColumn<?, ?> customers_col_customerID;

    @FXML
    private TableColumn<?, ?> customers_col_firstname;

    @FXML
    private TableColumn<?, ?> customers_col_lastName;

    @FXML
    private TableColumn<?, ?> customers_col_orders;

    @FXML
    private TableColumn<?, ?> customers_col_phoneNumber;

    @FXML
    private TableColumn<?, ?> customers_col_table;

    @FXML
    private TableView<?> customers_col_tableView;

    @FXML
    private TableColumn<?, ?> customers_col_totalPayment;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private TextField customers_serach;

    @FXML
    private AnchorPane dashboard_AT;

    @FXML
    private AnchorPane dashboard_CT;

    @FXML
    private AnchorPane dashboard_ET;

    @FXML
    private BarChart<?, ?> dashboard_ICchart;

    @FXML
    private BarChart<?, ?> dashboard_NOOCchart;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AnchorPane dashborad_form;

    @FXML
    private AnchorPane main_form;

    @FXML
    private TableView<?> menu__tableView;

    @FXML
    private Button menu_add;

    @FXML
    private Button menu_btn;

    @FXML
    private Button menu_clear;

    @FXML
    private TableColumn<?, ?> menu_col_price;

    @FXML
    private TableColumn<?, ?> menu_col_productID;

    @FXML
    private TableColumn<?, ?> menu_col_productName;

    @FXML
    private TableColumn<?, ?> menu_col_status;

    @FXML
    private TableColumn<?, ?> menu_col_type;

    @FXML
    private Button menu_delete;

    @FXML
    private AnchorPane menu_form;

    @FXML
    private TextField menu_price;

    @FXML
    private TextField menu_productID;

    @FXML
    private TextField menu_productName;

    @FXML
    private TextField menu_search;

    @FXML
    private ComboBox<?> menu_status;

    @FXML
    private ComboBox<?> menu_type;

    @FXML
    private Button menu_update;

    @FXML
    private Button minimize;

    @FXML
    private Button orders_add;

    @FXML
    private TextField orders_amount;

    @FXML
    private Button orders_btn;

    @FXML
    private AnchorPane orders_form;

    @FXML
    private Button orders_pay;

    @FXML
    private TableColumn<?, ?> orders_price;

    @FXML
    private TableColumn<?, ?> orders_productID;

    @FXML
    private TableColumn<?, ?> orders_productName;

    @FXML
    private TableColumn<?, ?> orders_quantity;

    @FXML
    private Button orders_receipt;

    @FXML
    private Button orders_remove;

    @FXML
    private TextField orders_search;

    @FXML
    private TableView<?> orders_tableView;

    @FXML
    private Label orders_total;

    @FXML
    private TableColumn<?, ?> orders_type;

    @FXML
    private Button reservations_add;

    @FXML
    private Button reservations_btn;

    @FXML
    private Button reservations_clear;

    @FXML
    private Button reservations_delete;

    @FXML
    private AnchorPane reservations_form;

    @FXML
    private TextField reservations_serach;

    @FXML
    private TableColumn<?, ?> reservations_status;

    @FXML
    private TableColumn<?, ?> reservations_tableNumber;

    @FXML
    private TableView<?> reservations_tableView;

    @FXML
    private TableColumn<?, ?> reservations_type;

    @FXML
    private Button reservations_update;

    @FXML
    private Button signout_btn;

    public void close(){
        System.exit(0);
    }

    public void minimize(){
        Stage stage = (Stage) main_form.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
