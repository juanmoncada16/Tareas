package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Controller {

    @FXML
    Button boton1;
    @FXML
    Button boton2;
    @FXML
    Button boton3;
    @FXML
    TextArea nombre;
    @FXML
    TextArea nota;
    @FXML
    TableView tabla;
    @FXML
    TableColumn nombrec;
    @FXML
    TableColumn notac;

    @FXML
    protected void guardar(ActionEvent save) {

        String valor1 = nombre.getText();
        String valor2 = nota.getText();


    }

    @FXML
    protected void mostrar(ActionEvent viewer) throws IOException {

        Stage stage = new Stage();
        Parent root = null;
        if (viewer.getSource() == boton2) {
            stage = (Stage) boton2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana2.fxml"));

        } else {
            stage = (Stage) boton3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("ventana.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}