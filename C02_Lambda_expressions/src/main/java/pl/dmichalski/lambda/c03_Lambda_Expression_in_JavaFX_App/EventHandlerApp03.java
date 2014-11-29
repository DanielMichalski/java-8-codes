package pl.dmichalski.lambda.c03_Lambda_Expression_in_JavaFX_App;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Author: Daniel
 */
public class EventHandlerApp03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Trigger ActionEvent");
        button.setOnAction(event -> System.out.println(event.toString()));
        stage.setScene(new Scene(button));
        stage.show();
    }

}