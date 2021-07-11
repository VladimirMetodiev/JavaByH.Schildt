package chapter17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyFirstJavaFXApplication extends Application {
    public static void main(String[] args) {
        System.out.println("Launching JavaFX application.");
        launch(args);
    }

    public void init() {
        System.out.println("Override the init() method.");
    }

    public void start(Stage primaryStage) {
        System.out.println("Override the start() method.");

        primaryStage.setTitle("JavaFX Skeleton.");                   // Давам на Stage-a заглавие

        FlowPane rootNode = new FlowPane();                     // Създавам коренов възел

        Scene myScene = new Scene(rootNode, 320, 220);      // Създавам сцена

        primaryStage.setScene(myScene);                              // Поставям "сцената" на "платформата"

        primaryStage.show();                                         // Показвам "платформата" с нейната "сцена"
    }

    public void stop() {
        System.out.println("Override the stop() method.");      // Текста ще се принтира на конзолата при закриване на прозореца
    }
}
