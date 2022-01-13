package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //VM options - https://openjfx.io/openjfx-docs/ (JavaFX intlliJ)
    //JavaFX SDK - https://gluonhq.com/products/javafx/ (Gluon JavaFX)
    //SceneBuilder - https://gluonhq.com/products/scene-builder/#download (javafe scene builder)



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("okno.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("Morseovka");
        stage.setScene(scene);
        stage.show();
    }
}
