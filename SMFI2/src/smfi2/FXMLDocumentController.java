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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import smfi2.SMFI2;
/**
 *
 * @author ckill
 */
public class FXMLDocumentController implements Initializable{
    
    @FXML
    private Button entrar;
    @FXML
    private TextField nombreUsuario;
    @FXML
    private TextField passwordUsuario;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
  

    @FXML
    private void entrar(ActionEvent event) throws Exception {

        mostrarEscena2();
        
    }
      
    public void mostrarEscena2() throws Exception{
        Stage stage2 = (Stage) this.entrar.getScene().getWindow();
        stage2.close();
        Stage stage = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("ventana2.fxml"));
        Scene scene = new Scene(root2);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
