package com.example.cirkletransition;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);

        Circle circle = new Circle(50,50,50);
        circle.setFill(Color.BLACK);
        root.getChildren().add(circle);

        FadeTransition ft = new FadeTransition(Duration.millis(3000), circle);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);

        ft.play();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}