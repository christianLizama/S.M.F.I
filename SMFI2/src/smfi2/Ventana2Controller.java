/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smfi2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ckill
 */
public class Ventana2Controller implements Initializable {

    @FXML
    private TextField nombre;
    @FXML
    private TextField rut;
    @FXML
    private TextField especialidad;
    @FXML
    private TextField correo;
    @FXML
    private Button salir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pulsarSalir(ActionEvent event) {
        
        Stage stage = (Stage) this.salir.getScene().getWindow();
        stage.close();
        
    }
    
}
