package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class warmUp extends Application {

    TextField tf;
    Button btnEnter;

    @Override
    public void start(Stage myStage) throws Exception {
        myStage.setTitle("Warm Up");
        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10);
        root.setAlignment(Pos.CENTER);
        root.setColumnHalignment(HPos.CENTER);
        Scene myScene = new Scene(root, 300, 300);
        myStage.setScene(myScene);

        Label line = new Label("Enter Your Name: ");

        tf = new TextField();
        tf.setPromptText("Enter Your Name");
        tf.setPrefColumnCount(10);

        btnEnter = new Button("Enter");
        root.getChildren().addAll(line,tf,btnEnter);

        btnEnter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                root.getChildren().removeAll(line,tf,btnEnter);
                Label line1 = new Label("Hello, "+tf.getText()+"\nHave a good day.");
                root.getChildren().addAll(line1);
            }
        });
        myStage.show();
    }

    public static void main (String[] args) {
        launch(args);
    }
}
