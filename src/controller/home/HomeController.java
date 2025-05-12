/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.home;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class HomeController {

    // Métodos que manejan las acciones del menú
    @FXML
    private AnchorPane contenedorPrincipal;

    @FXML
    private void manejarOpcionUsuarios() {
        try {
            AnchorPane vista = FXMLLoader.load(getClass().getResource("/usuarios/UsuariosView.fxml"));
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void manejarOpcionEquipos() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/equipos/EquiposView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void manejarOpcion3() {
        System.out.println("Opción 3 seleccionada");
    }
}
