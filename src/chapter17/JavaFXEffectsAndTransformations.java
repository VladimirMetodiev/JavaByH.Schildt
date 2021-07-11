package chapter17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class JavaFXEffectsAndTransformations extends Application {
    private double angle = 0.0;
    private double scaleFactor = 0.4;
    private double blurValue = 1.0;

    // Създавам (обектите на) ефекти Reflection и BoxBlur, и трансформациите Rotate и Scale
    private Reflection reflection = new Reflection();
    private BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    private Rotate rotate = new Rotate();
    private Scale scale = new Scale(scaleFactor, scaleFactor);

    private Button buttonRotate = new Button("Rotate");
    private Button buttonBlur = new Button("Blur off");
    private Button buttonScale = new Button("Scale");

    private Label labelReflection = new Label("Reflection Adds Visual Sparkle");


    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) {
        primaryStage.setTitle("Effects and transformations");


        FlowPane rootNode = new FlowPane(50, 50);               // Отстоянията между компонентите са зададени на 50
        rootNode.setAlignment(Pos.CENTER);


        Scene scene = new Scene(rootNode, 360, 160);
        primaryStage.setScene(scene);


        buttonRotate.getTransforms().add(rotate);                           // Добавям ротация в списъкът на трансформациите за бутон buttonRotate
        buttonScale.getTransforms().add(scale);                             // Добавям мащабиране в списъкът на трансформациите за бутон buttonScale


        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        labelReflection.setEffect(reflection);                              // Поставям ефект рефлексия на етикет labelReflection


        buttonRotate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                angle += 15.0;

                rotate.setAngle(angle);
                rotate.setPivotX(buttonRotate.getWidth() / 2);
                rotate.setPivotY(buttonRotate.getHeight() / 2);
            }
        });


        buttonScale.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                scaleFactor += 0.1;
                if(scaleFactor > 2.0) scaleFactor = 0.4;

                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });


        buttonBlur.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(blurValue == 10.0) {
                    blurValue = 1.0;
                    buttonBlur.setEffect(null);
                    buttonBlur.setText("Blur off");
                }
                else {
                    blurValue++;
                    buttonBlur.setEffect(blur);
                    buttonBlur.setText("Blur on");
                }

                blur.setWidth(blurValue);
                blur.setHeight(blurValue);
            }
        });


        rootNode.getChildren().addAll(buttonRotate, buttonScale, buttonBlur, labelReflection);


        primaryStage.show();
    }
}
