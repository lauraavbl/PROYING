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
public class CitaController implements Initializable {
    @FXML
    void ShowBack(ActionEvent event) throws IOException{
        Main.getInstance().ShowInit();
    }
   @FXML
    void ShowAgendarCita(ActionEvent event) throws IOException{
        Main.getInstance().ShowAgenCita();
    }
    @FXML
    void ShowActualizarCita(ActionEvent event) throws IOException{
        Main.getInstance().ShowActCita();
    }
    @FXML
    void ShowConsultarCita(ActionEvent event) throws IOException{
        Main.getInstance().ShowCheckCita();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
