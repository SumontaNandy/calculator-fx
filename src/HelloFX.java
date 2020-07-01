/*
* Author: Utchchhwas Singha
* Last Modified: 11:31 PM 01-July-2020
 */

// Imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// HelloFX class
public class HelloFX extends Application {
    private Font font; // Font used in the program

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the title of the window
        primaryStage.setTitle("HelloFX");

        // Create a root for the scene graph
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setAlignment(Pos.CENTER);
        root.setColumnHalignment(HPos.CENTER);

        // Create a new scene with the root
        Scene scene = new Scene(root, 400, 400);

        // Create a prompt text
        Label promptText = new Label("What's your name?");
        font = new Font("Calibri" ,24);
        promptText.setFont(font);
        // Create a text field
        TextField textFiled = new TextField();

        // Add everything to the root
        root.getChildren().addAll(promptText, textFiled);

        // Handle event when pressed 'Enter' in the text field
        textFiled.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // First clear everything from the root
                root.getChildren().removeAll(promptText, textFiled);

                // A new label which greets the user
                Label greeting1 = new Label("Hello, " + textFiled.getText() + ".");
                greeting1.setFont(font);
                Label greeting2 = new Label("Have a nice day :)");
                greeting2.setFont(font);

                // aDd the new label to the root
                root.getChildren().addAll(greeting1, greeting2);
            }
        });

        // Set the scene on the stage
        primaryStage.setScene(scene);
        // Finally, display the stage
        primaryStage.show();
    }
}
