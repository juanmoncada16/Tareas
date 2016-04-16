package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML private Button boton;
    @FXML private Button boton2;
    @FXML private Label confir;
    @FXML private TextArea nom1;
    @FXML private TextArea edad;

    @FXML protected void pulsar (ActionEvent Procesar) {
        String nombre = nom1.getText();
        String edad1 = edad.getText();
        int valor = Integer.parseInt(edad1);

        if ( valor >= 18 )
            confir.setText("Puedes votar, " + nombre);
        else if ( valor < 18 ) {
            confir.setText("No puedes votar, " + nombre);
        }
    }
}