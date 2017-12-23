package JavaFX.lesson02.calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalcMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("SimpleCalculator");
        primaryStage.setResizable(false);

        Parent root = FXMLLoader.load(
                getClass().getResource("/JavaFX/lesson02/calc/view/calculator.fxml"));
        primaryStage.setScene((new Scene(root)));

        primaryStage.show();

    }
}
