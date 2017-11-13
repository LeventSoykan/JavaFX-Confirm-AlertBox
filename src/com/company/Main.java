package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;




public class Main extends Application {


    Stage mWindow;
    Button mButton;

    public static void main(String[] args) {
	// write your code here
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mWindow = primaryStage;
        mWindow.setTitle("thenewboston");
        mWindow.setOnCloseRequest(event -> {
            event.consume();
            closeProgram();
        });

//        mButton = new Button("Click Me");
//        mButton.setOnAction(e -> {
//            boolean result = ConfirmBox.display("Window Title", "Are you sure?");
//            System.out.println(result);
//        });
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1,2);

        grid.getChildren().addAll(nameInput, nameLabel, passInput, passLabel, loginButton);

        Scene scene = new Scene(grid, 300, 200);
        mWindow.setScene(scene);
        mWindow.show();

    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Quit?", "Sure you want to quit?");
        if(answer) {
            System.out.println("File is saved");
            mWindow.close();
        }
    }


}
