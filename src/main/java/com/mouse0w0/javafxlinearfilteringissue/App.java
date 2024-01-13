package com.mouse0w0.javafxlinearfilteringissue;

import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseMap(new Image(App.class.getResource("/image.png").openStream()));

        Box box = new Box(200, 200, 200);
        box.setMaterial(material);
        box.setTranslateX(250);
        box.setTranslateY(250);
        box.setRotate(70);
        box.setRotationAxis(new Point3D(1,1,1));

        Group root = new Group(box);
        Scene scene = new Scene(root);
        scene.setFill(Color.BLACK);

        PerspectiveCamera camera = new PerspectiveCamera();
        scene.setCamera(camera);

        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}