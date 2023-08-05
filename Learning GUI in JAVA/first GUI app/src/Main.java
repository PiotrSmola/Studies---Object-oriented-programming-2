import javafx.application.Application;
import javafx.scene.Scene;
import javafx.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    Button przycisk;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Pierwsza aplikacja GUI");
        przycisk = new Button();
        przycisk.setText("Kliknij tutaj");

        StackPane layout = new StackPane();
        layout.getChildren().add(przycisk);

        Scene scena = new Scene(layout, 640, 360);
        primaryStage.setScene(scena);
        primaryStage.show();

    }
}