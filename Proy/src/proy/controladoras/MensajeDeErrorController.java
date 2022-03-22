package proy.controladoras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author laura
 */
public class MensajeDeErrorController implements Initializable {

        @FXML
    private Text alertext;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(Main.TextAlert);
        alertext.setText(Main.TextAlert);
    }    
    
    
}
