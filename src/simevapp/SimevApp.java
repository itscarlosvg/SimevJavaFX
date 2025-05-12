
package simevapp;

import javafx.application.Application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author carlo
 */
public class SimevApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Carga el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/LogInScreen.fxml"));
            Parent root = loader.load();

            // Crea la escena con el nodo raíz
            Scene scene = new Scene(root);

            // Configura y muestra la ventana principal
            primaryStage.setTitle("Login - SIMEV");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
