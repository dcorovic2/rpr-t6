package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("unosStudenta.fxml"));
        primaryStage.setTitle("Formular za unos studenta");
        primaryStage.setScene(new Scene(root, 647.0, 721.0));
        primaryStage.show();
        primaryStage.setResizable(false);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
