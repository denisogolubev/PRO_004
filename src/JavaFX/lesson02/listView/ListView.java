package JavaFX.lesson02.listView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ListView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ListView");

        Parent root = FXMLLoader.load(
                getClass().getResource("/JavaFX/lesson02/menuDemo/view.fxml"));
        primaryStage.setScene((new Scene(root, 400, 300)));

        primaryStage.show();

    }
}
