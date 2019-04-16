package com.marsdev.javafx.samples.controlsfx;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.controlsfx.tools.Borders;

public class ControlsFXApp extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("ControlsFX");
        Node wrappedButton = Borders.wrap(button)
                .lineBorder()
                .title("Line")
                .color(Color.GREEN)
                .thickness(1, 0, 0, 0)
                .thickness(1)
                .radius(0, 5, 5, 0)
                .build()
                .emptyBorder()
                .padding(20)
                .build()
                .etchedBorder()
                .title("Etched")
                .build()
                .emptyBorder()
                .padding(20)
                .build()
                .build();
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        VBox vBox = new VBox();
        vBox.getChildren().addAll(wrappedButton, l);
        Scene scene = new Scene(vBox, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
