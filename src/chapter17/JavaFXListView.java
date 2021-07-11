package chapter17;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXListView extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("List View");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 260, 120);

        primaryStage.setScene(scene);

        Label response = new Label("Select computer type:");

        // Създавам обект от тип ObservableList за списъка
        ObservableList<String> computerTypes = FXCollections.observableArrayList("Mainframe computer", "Desktop computer", "Laptop", "Notebook", "Tablet", "Smartphone", "Personal Digital Assistant");

        ListView<String> listView = new ListView<>(computerTypes);      // Създавам самият ListView-списък

        listView.setPrefSize(160, 70);

        MultipleSelectionModel<String> multipleSelectionModel = listView.getSelectionModel();       // Задавам модел за ListView-списъка

        // Създавам обработчик на събитията (т.е. изменението в ListView-списъка)
        multipleSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                response.setText("Computer selected is: " + newValue);
            }
        });

        rootNode.getChildren().addAll(listView, response);

        primaryStage.show();
    }
}
