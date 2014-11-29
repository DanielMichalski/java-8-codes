package pl.dmichalski.c03_Lambda_Expression_in_JavaFX_App;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Author: Daniel
 */
public class EventHandlerApp01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Trigger ActionEvent");
        button.setOnAction(new DemoEventHandler1());
        stage.setScene(new Scene(button));
        stage.show();
    }

}

class DemoEventHandler1 implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println(event.toString());
    }

}