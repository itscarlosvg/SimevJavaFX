/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.home;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class HomeController {

    // Métodos que manejan las acciones del menú
    @FXML
    private AnchorPane contenedorPrincipal;

    @FXML
    private JFXButton btnMasOpciones;


    @FXML
    public void initialize() {
        ContextMenu menu = new ContextMenu();

        menu.getItems().addAll(
                crearMenuItem("COMPRAS", e -> manejarOpcionCompras()),
                crearMenuItem("PROVEEDORES", e -> manejarOpcionProveedores()),
                crearMenuItem("CLIENTES", e -> manejarOpcionClientes()),
                crearMenuItem("ORDENES DE SERVICIO", e -> manejarOpcionOrdenesServicio()),
                crearMenuItem("FACTURAS", e -> manejarOpcionFacturas()),
                crearMenuItem("FICHAJES", e -> manejarOpcionFichajes()),
                crearMenuItem("VACACIONES", e -> manejarOpcionVacaciones())
        );

        btnMasOpciones.setOnAction(e -> {
            // Mostrar debajo del botón
            menu.show(btnMasOpciones, Side.BOTTOM, 0, 0);
        });
    }

    private MenuItem crearMenuItem(String texto, EventHandler<ActionEvent> handler) {
        MenuItem item = new MenuItem(texto);
        item.setOnAction(handler);
        return item;
    }

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
