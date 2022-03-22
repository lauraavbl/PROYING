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

/**
 * FXML Controller class
 *
 * @author laura
 */
public class MenuController implements Initializable {

    @FXML
    void ShowCerrarSesion(ActionEvent event) throws IOException{
        Main.getInstance().ShowInit();
    }
    @FXML
    void ShowHistory(ActionEvent event) throws IOException{
        Main.getInstance().ShowHistoria();
    }
    @FXML
    void ShowAppointment(ActionEvent event) throws IOException{
        Main.getInstance().ShowCita();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
