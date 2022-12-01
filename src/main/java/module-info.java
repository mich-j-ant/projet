module com.example.projet {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.ubx.poo.ubomb to javafx.fxml;
    exports fr.ubx.poo.ubomb;
}