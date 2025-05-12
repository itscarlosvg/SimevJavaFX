/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.home;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class HomeController {

    @FXML
    private MenuItem opcion1;
    @FXML
    private MenuItem opcion2;
    @FXML
    private MenuItem opcion3;
    
    // Métodos que manejan las acciones del menú
    public void manejarOpcion1() {
        System.out.println("Opción 1 seleccionada");
    }

    public void manejarOpcion2() {
        System.out.println("Opción 2 seleccionada");
    }

    public void manejarOpcion3() {
        System.out.println("Opción 3 seleccionada");
    }
}