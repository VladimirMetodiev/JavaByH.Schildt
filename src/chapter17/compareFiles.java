package chapter17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class compareFiles extends Application {
    private String theFirstFile = "";
    private String theSecondFile = "";
    private Label result = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Compare two files");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 240, 160);

        primaryStage.setScene(scene);


        TextField theFirstTextField = new TextField();
        theFirstTextField.setPromptText("Enter a file.");
        theFirstTextField.setPrefColumnCount(14);
        theFirstTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!theFirstTextField.getText().isEmpty()) {
                    theFirstFile = theFirstTextField.getText();
                    theFirstTextField.clear();
                }
                else {
                    result.setText("The first text field is empty.");
                }
            }
        });

        Button one = new Button("Add");
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!theFirstTextField.getText().isEmpty()) {
                    theFirstFile = theFirstTextField.getText();
                    theFirstTextField.clear();
                }
                else {
                    result.setText("The first text field is empty.");
                }
            }
        });

        TextField theSecondTextField = new TextField();
        theSecondTextField.setPromptText("Enter a file.");
        theSecondTextField.setPrefColumnCount(14);
        theSecondTextField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!theSecondTextField.getText().isEmpty()) {
                    theSecondFile = theSecondTextField.getText();
                    theSecondTextField.clear();
                }
                else {
                    result.setText("The second text field is empty.");
                }
            }
        });

        Button two = new Button("Add");
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!theSecondTextField.getText().isEmpty()) {
                    theSecondFile = theSecondTextField.getText();
                    theSecondTextField.clear();
                }
                else {
                    result.setText("The second text field is empty.");
                }
            }
        });

        Button compare = new Button("Compare");
        compare.setPrefSize(220, 28);
        compare.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int first, second;
                boolean areTheyDifferent = true;

                if(theFirstFile.equals("")) {
                    result.setText("First file name missing.");
                    return;
                }
                if(theSecondFile.equals("")) {
                    result.setText("Second file name missing.");
                    return;
                }

                try(FileInputStream theFirst = new FileInputStream(theFirstFile); FileInputStream theSecond = new FileInputStream(theSecondFile)){
                    do{
                        first = theFirst.read();
                        second = theSecond.read();

                        if(first - second != 0){
                            areTheyDifferent = false;
                            break;
                        }

                    } while (first != -1 && second != -1);

                    if(areTheyDifferent) result.setText("The two files are identical.");
                    else result.setText("The two files are different.");
                }
                catch (FileNotFoundException ex1){
                    result.setText("There isn't such file!");
                }
                catch (IOException ex2){
                    result.setText("File error!");
                }
            }
        });

        result.setFont(new Font("Tahoma", 16));
        result.setText(" >>> Compare files ... ");


        rootNode.getChildren().addAll(theFirstTextField, one, theSecondTextField, two, compare, result);

        primaryStage.show();
    }
}



//Tests

//text\\ShowText.txt
//text\\CopyOfShowText.txt

//text\\ShowText.txt
//text\\CopyOfShowText2.txt
