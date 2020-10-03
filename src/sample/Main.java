package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    Button right;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Stem.ru");
        BorderPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene login = new Scene(pane);
        primaryStage.setScene(login);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
