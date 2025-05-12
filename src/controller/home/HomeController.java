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

    @FXML
    private void manejarOpcionMantenimientos() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mantenimientos/MantenimientosView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionCompras() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/compras/ComprasView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionProveedores() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/proveedores/ProveedoresView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionClientes() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/clientes/ClientesView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionOrdenesServicio() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ordenesServicio/OrdenesServicioView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionFacturas() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/facturas/FacturasView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionFichajes() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fichajes/FichajesView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void manejarOpcionVacaciones() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vacaciones/vacacionesView.fxml"));
            Parent vista = loader.load();
            contenedorPrincipal.getChildren().setAll(vista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
