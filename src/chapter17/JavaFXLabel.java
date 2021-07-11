package chapter17;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXLabel extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("JavaFX Label");

        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 300, 60);

        primaryStage.setScene(scene);

        Font font = new Font("Courier New", 16);

        Label javaFXLabel = new Label();
        javaFXLabel.setFont(font);
        javaFXLabel.setText("JavaFX is a powerful GUI");

        rootNode.getChildren().add(javaFXLabel);

        primaryStage.show();
    }
}
