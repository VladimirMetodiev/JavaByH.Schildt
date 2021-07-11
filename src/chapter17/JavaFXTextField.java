package chapter17;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXTextField extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text field");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 230, 140);

        primaryStage.setScene(scene);

        Label response = new Label("Enter Name: ");

        Button buttonGetName = new Button("Get Name");

        TextField textField = new TextField();
        textField.setPromptText("Enter a name.");
        textField.setPrefColumnCount(15);
        textField.setOnAction( (ae) -> response.setText("Enter pressed. Name is: " + textField.getText()));
        buttonGetName.setOnAction((ae) -> response.setText("Button pressed. Name is: " + textField.getText()));

        Separator separator = new Separator();
        separator.setPrefWidth(180);

        rootNode.getChildren().addAll(textField, buttonGetName, separator, response);

        primaryStage.show();
    }
}
