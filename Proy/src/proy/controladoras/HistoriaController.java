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
public class HistoriaController implements Initializable {

     @FXML
    void ShowBack(ActionEvent event) throws IOException{
        Main.getInstance().ShowInit();
    }
   @FXML
    void ShowConsultarHistoria(ActionEvent event) throws IOException{
        Main.getInstance().ShowChequearHistoria();
    }
    @FXML
    void ShowActualizarHistoria(ActionEvent event) throws IOException{
        Main.getInstance().ShowActHistoria();
    }
    @FXML
    void ShowCrearHistoria(ActionEvent event) throws IOException{
        Main.getInstance().ShowCreateHistoria();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
