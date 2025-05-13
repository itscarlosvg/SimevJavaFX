/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.home;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXPopup.PopupHPosition;
import com.jfoenix.controls.JFXPopup.PopupVPosition;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class HomeController {

    // Métodos que manejan las acciones del menú
    @FXML
    private AnchorPane contenedorPrincipal;

    @FXML
    private JFXButton btnMasOpciones;

    @FXML
    public void initialize() {
        System.out.println("Inicializado");
        JFXPopup popup = new JFXPopup();

        VBox content = new VBox(5);
        content.setStyle("-fx-background-color: yellow; -fx-padding: 10;");
        content.getChildren().addAll(
                crearBotonPopup("COMPRAS", "#manejarOpcionCompras"),
                crearBotonPopup("PROVEEDORES", "#manejarOpcionProveedores"),
                crearBotonPopup("CLIENTES", "#manejarOpcionClientes"),
                crearBotonPopup("ORDENES DE SERVICIO", "#manejarOpcionOrdenesServicio"),
                crearBotonPopup("FACTURAS", "#manejarOpcionFacturas"),
                crearBotonPopup("FICHAJES", "#manejarOpcionFichajes"),
                crearBotonPopup("VACACIONES", "#manejarOpcionVacaciones")
        );

        popup.setPopupContent(content);

        System.out.println("Boton: " + btnMasOpciones);
        btnMasOpciones.setOnAction(e -> {
            popup.show(btnMasOpciones,
                    PopupVPosition.BOTTOM,
                    PopupHPosition.LEFT,
                    0, 55);
        });
    }

    private JFXButton crearBotonPopup(String texto, String handlerName) {
        JFXButton b = new JFXButton(texto);
        b.getStyleClass().add("menu-button");
        b.setOnAction(e -> {
            try {
                Method metodo = this.getClass().getDeclaredMethod(handlerName.replace("#", ""), ActionEvent.class);
                metodo.invoke(this, new ActionEvent());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        return b;
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
