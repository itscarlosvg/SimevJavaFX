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
import model.Sesion;
import model.Usuario;
import model.Usuario.Rol;
import modelo.Usuario; // Asegúrate de importar correctamente
import util.Sesion;    // Asegúrate de importar correctamente

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

        // Simulación simple (puedes reemplazar por lógica real de DB)
        if ("admin".equals(usuario) && "1234".equals(contrasena)) {
            Usuario u = new Usuario("admin", "1234", Rol.ADMIN);
            Sesion.setUsuarioActual(u);
            abrirPantallaPrincipal();
        } else if ("empleado".equals(usuario) && "1234".equals(contrasena)) {
            Usuario u = new Usuario("empleado", "1234", Rol.EMPLEADO);
            Sesion.setUsuarioActual(u);
            abrirPantallaPrincipal();
        } else if ("cliente".equals(usuario) && "1234".equals(contrasena)) {
            Usuario u = new Usuario("cliente", "1234", Rol.CLIENTE);
            Sesion.setUsuarioActual(u);
            abrirPantallaPrincipal();
        } else {
            mostrarError();
        }
    }

    private void mostrarError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error de inicio de sesión");
        alert.setHeaderText(null);
        alert.setContentText("Usuario o contraseña incorrectos.");
        alert.showAndWait();
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
