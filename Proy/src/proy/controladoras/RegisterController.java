/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proy.controladoras;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import proy.modeladoras.Persona;

/**
 * FXML Controller class
 *
 * @author laura
 */
public class RegisterController implements Initializable {

    @FXML
    void ShowBack(ActionEvent event) throws IOException {
        Main.getInstance().ShowInit();
    }
    @FXML
    private TextField addressField;

    @FXML
    private TextField ciField;

    @FXML
    private PasswordField passWordField;

    @FXML
    private TextField estadoCivil;

    @FXML
    private TextField fechaField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField ocupacion;

    @FXML
    private TextField profesion;

    @FXML
    private ComboBox<String> rolbox;

    @FXML
    private TextField sexField;

    @FXML
    private TextField telField;

    @FXML
    private TextField telefonoref;

    ObservableList<String> rol = FXCollections.observableArrayList("Medico",
            "Paciente", "Secretaria");

    @FXML
    void submitFields(ActionEvent event) throws IOException {

        for (Iterator<Persona> it = Persona.personas.iterator(); it.hasNext();) {
            Persona p = it.next();
            if (p.ci.equals(ciField.getText())) {
                return;
            }
        }
        Persona user = new Persona(nameField.getText(), lastNameField.getText(),
                ciField.getText(), sexField.getText(), fechaField.getText(),
                estadoCivil.getText(), addressField.getText(), telField.getText(),
                ocupacion.getText(), profesion.getText(), rolbox.getValue(), telefonoref.getText(),
                passWordField.getText());

        Persona.addPerson(user);
        Main.getInstance().ShowLogin();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rolbox.setItems(rol);
        // TODO
    }

}
