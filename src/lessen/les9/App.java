package lessen.les9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
    public static void main(String[] args) throws Exception {
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlPagina = "gui.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPagina));
        Parent root = loader.load();

        stage.setTitle("HotelApp");
        stage.setScene(new Scene(root));
        stage.show();
    }
}