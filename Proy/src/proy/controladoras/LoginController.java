/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package proy.controladoras;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import proy.modeladoras.Persona;

/**
 * FXML Controller class
 *
 * @author laura
 */
public class LoginController implements Initializable {

    @FXML
    private PasswordField passwordtext;

    @FXML
    private TextField usertext;

    @FXML
    void ShowBack(ActionEvent event) throws IOException {
        Main.getInstance().ShowInit();
    }

    @FXML
    void ShowIngresar(ActionEvent event) throws IOException {
        for (Persona p : Persona.personas) {
            if (usertext.getText().equals(p.ci) && passwordtext.getText().equals(p.password)) {
                Main.getInstance().ShowMenu();
                return;
            }
        }
        Main.getInstance().ShowAlert("Usuario y/o password no valido");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
