package lab08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lab08 extends Application {

    public static void main(String[] args) {

        Application.launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle outerCircle = new Circle();
        outerCircle.setCenterX(100);
        outerCircle.setCenterY(100);
        outerCircle.setRadius(80);
        outerCircle.setStroke(Color.BLACK);
        outerCircle.setFill(null);

        Circle innerEyeLeft = new Circle();
        innerEyeLeft.setCenterX(70);
        innerEyeLeft.setCenterY(70);
        innerEyeLeft.setRadius(10);
        innerEyeLeft.setStroke(Color.BLACK);
        innerEyeLeft.setFill(Color.BLACK);

        Circle innerEyeRight = new Circle();
        innerEyeRight.setCenterX(130);
        innerEyeRight.setCenterY(70);
        innerEyeRight.setRadius(10);
        innerEyeRight.setStroke(Color.BLACK);
        innerEyeRight.setFill(Color.BLACK);

        Ellipse outerEyeLeft = new Ellipse(70, 70, 20, 15);
        outerEyeLeft.setStroke(Color.BLACK);
        outerEyeLeft.setFill(null);

        Ellipse outerEyeRight = new Ellipse(130, 70, 20, 15);
        outerEyeRight.setStroke(Color.BLACK);
        outerEyeRight.setFill(null);

        Line noseBottom = new Line(80, 120, 120, 120);
        Line noseLeft = new Line(100, 80, 80, 120);
        Line noseRight = new Line(100, 80, 120, 120);

        Arc mouth = new Arc(100, 130, 40, 15, 180, 180);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(null);

        Pane pane = new Pane();
        pane.getChildren().addAll(outerCircle, innerEyeLeft, innerEyeRight, outerEyeLeft, outerEyeRight,
                noseBottom, noseLeft, noseRight, mouth);

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("Lab08");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
