/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class LogInController {

    @FXML
    private TextField usuarioField;
    
    @FXML
    private PasswordField contrasenaField;
    
    @FXML
    private Button loginButton;
    
    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String usuario = usuarioField.getText();
        String contrasena = contrasenaField.getText();
        
        // Verificar las credenciales (de prueba)
        if ("admin".equals(usuario) && "1234".equals(contrasena)) {
            // Si las credenciales son correctas, abrir la pantalla principal
            abrirPantallaPrincipal();
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de inicio de sesión");
            alert.setHeaderText(null);
            alert.setContentText("Usuario o contraseña incorrectos.");
            alert.showAndWait();
        }
    }

    private void abrirPantallaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/home/HomeScreen.fxml"));
            Parent root = loader.load();
            
            Stage stage = new Stage();
            stage.setTitle("Pantalla Principal");
            stage.setScene(new Scene(root, 800, 600));
            stage.show();
            
            // Cerrar la ventana de login
            Stage currentStage = (Stage) loginButton.getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

