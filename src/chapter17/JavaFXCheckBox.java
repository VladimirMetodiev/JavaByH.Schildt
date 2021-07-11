package chapter17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXCheckBox extends Application {
    private Label heading;
    private Label response;
    private Label selected;

    private CheckBox smartPhone;
    private CheckBox tablet;
    private CheckBox laptop;
    private CheckBox desktop;

    private StringBuilder computers;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Check boxes");

        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
        rootNode.setAlignment(Pos.TOP_CENTER);

        Scene scene = new Scene(rootNode, 315, 200);

        primaryStage.setScene(scene);

        heading = new Label("    What kind of computer do you have?    ");
        response = new Label("");
        selected = new Label("");

        smartPhone = new CheckBox("Smartphone");
        tablet = new CheckBox("Tablet");
        laptop = new CheckBox("Laptop");
        desktop = new CheckBox("Desktop");

        // Активизирам неопределеното състояние на бутоните
//        smartPhone.setAllowIndeterminate(true);
//        tablet.setAllowIndeterminate(true);
//        laptop.setAllowIndeterminate(true);
//        desktop.setAllowIndeterminate(true);

        smartPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(smartPhone.isSelected()) response.setText("The smartphone was selected.");
                else response.setText("The smartphone was cleared.");
                showAll();
            }
        });

        tablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tablet.isSelected()) response.setText("The tablet was selected.");
                else response.setText("The tablet was cleared.");
                showAll();
            }
        });

        laptop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(laptop.isSelected()) response.setText("The laptop was selected.");
                else response.setText("The laptop was cleared.");
                showAll();
            }
        });

        desktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(desktop.isSelected()) response.setText("The desktop was selected.");
                else response.setText("The desktop was cleared.");
                showAll();
            }
        });

        rootNode.getChildren().addAll(heading, smartPhone, tablet, laptop, desktop, response, selected);

        primaryStage.show();
        showAll();
    }

    private void showAll() {
        computers = new StringBuilder();
        if(smartPhone.isSelected()) computers.append("smartphone ");
        if(tablet.isSelected()) computers.append("tablet ");
        if(laptop.isSelected()) computers.append("laptop ");
        if(desktop.isSelected()) computers.append("desktop");

        selected.setText("Computers selected: " + computers.toString());
    }
}
