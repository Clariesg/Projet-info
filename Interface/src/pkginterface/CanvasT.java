/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.effect.DropShadow;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.CycleMethod;
//import javafx.scene.paint.LinearGradient;
//import javafx.scene.paint.RadialGradient;
//import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class CanvasT extends Application {

    private Canvas canvas = new Canvas(200, 200);
    private GraphicsContext gc = canvas.getGraphicsContext2D();
    private Group root = new Group();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas Test");
        moveCanvas(0,0);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    /**
     * Moves the canvas to a new location within the Scene. This is accomplished
     * by performing a translation transformation on the Canvas object, passing 
     * in the desired x and y coordinates. Passing in values of 0,0 will position
     * the Canvas in the upper left corner of the Scene.
     * @param x The new x coordinate
     * @param y The new y coordinate
     */
    private void moveCanvas(int x, int y) {
        canvas.setTranslateX(x);
        canvas.setTranslateY(y);
    }

}
