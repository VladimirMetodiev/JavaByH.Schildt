package chapter17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXButtons extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Use JavaFX Buttons and Events.");

        FlowPane rootNode = new FlowPane(10, 10);       // Със стойностите в скобите се поставят отстояния между компонентите
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 300, 60);

        primaryStage.setScene(scene);

        Label response = new Label("Push a Button");            // Създадох етикет

        Button buttonUp = new Button("Up");                 // Създадох бутона Up
        Button buttonDown = new Button("Down");            // Създадох бутона Down

        buttonUp.setOnAction((event) -> response.setText("You pressed Up."));        // Обработчик на събитие за бутона Up с ламбда израз

        buttonDown.setOnAction(new EventHandler<ActionEvent>() {        // Обработчик на събитие за бутона Down с анонимен клас
            public void handle(ActionEvent event) {
                response.setText("You pressed Down.");
            }
        });

        rootNode.getChildren().addAll(buttonUp, buttonDown, response);      // Добавям всички компоненти в графиката на сцената

        primaryStage.show();
    }
}
