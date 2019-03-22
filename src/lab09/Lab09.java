package lab09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Lab09 extends Application {

    public static void main(String[] args) {

        Application.launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gPane = new GridPane();

        GridPane cPane1 = new GridPane();
        GridPane cPane2 = new GridPane();
        GridPane cPane3 = new GridPane();
        GridPane cPane4 = new GridPane();

        Circle circle1 = new Circle(50, null);
        Circle circle2 = new Circle( 50, null);
        Circle circle3 = new Circle(50, null);
        Circle circle4 = new Circle(50, null);

        circle1.setStroke(Color.BLACK);
        circle2.setStroke(Color.BLACK);
        circle3.setStroke(Color.BLACK);
        circle4.setStroke(Color.BLACK);

        gPane.setAlignment(Pos.CENTER);
        gPane.setPadding(new Insets(50, 50, 50, 50));
        gPane.setHgap(10);
        gPane.setVgap(10);

        gPane.add(circle1, 0, 0);
        gPane.add(circle2, 0, 1);
        gPane.add(circle3, 1, 0);
        gPane.add(circle4, 1, 1);

        Arc arc11 = new Arc(0, 0, 35, 35, 112.5, 45);
        arc11.setType(ArcType.ROUND);
        arc11.setFill(Color.RED);
        Arc arc12 = new Arc(0, 0, 35, 35, 202.5, 45);
        arc12.setType(ArcType.ROUND);
        arc12.setFill(Color.RED);
        Arc arc13 = new Arc(0, 0, 35, 35, 22.5, 45);
        arc13.setType(ArcType.ROUND);
        arc13.setFill(Color.RED);
        Arc arc14 = new Arc(0, 0, 35, 35, 292.5, 45);
        arc14.setType(ArcType.ROUND);
        arc14.setFill(Color.RED);

        cPane1.setAlignment(Pos.CENTER);

        cPane1.add(arc11, 0, 0);
        cPane1.add(arc12, 0, 1);
        cPane1.add(arc13, 1, 0);
        cPane1.add(arc14, 1, 1);

        gPane.add(cPane1, 0, 0);

        Arc arc21 = new Arc(0, 0, 35, 35, 112.5, 45);
        arc21.setType(ArcType.ROUND);
        arc21.setFill(Color.RED);
        Arc arc22 = new Arc(0, 0, 35, 35, 202.5, 45);
        arc22.setType(ArcType.ROUND);
        arc22.setFill(Color.RED);
        Arc arc23 = new Arc(0, 0, 35, 35, 22.5, 45);
        arc23.setType(ArcType.ROUND);
        arc23.setFill(Color.RED);
        Arc arc24 = new Arc(0, 0, 35, 35, 292.5, 45);
        arc24.setType(ArcType.ROUND);
        arc24.setFill(Color.RED);

        cPane2.setAlignment(Pos.CENTER);

        cPane2.add(arc21, 0, 0);
        cPane2.add(arc22, 0, 1);
        cPane2.add(arc23, 1, 0);
        cPane2.add(arc24, 1, 1);

        gPane.add(cPane2, 0, 1);

        Arc arc31 = new Arc(0, 0, 35, 35, 112.5, 45);
        arc31.setType(ArcType.ROUND);
        arc31.setFill(Color.RED);
        Arc arc32 = new Arc(0, 0, 35, 35, 202.5, 45);
        arc32.setType(ArcType.ROUND);
        arc32.setFill(Color.RED);
        Arc arc33 = new Arc(0, 0, 35, 35, 22.5, 45);
        arc33.setType(ArcType.ROUND);
        arc33.setFill(Color.RED);
        Arc arc34 = new Arc(0, 0, 35, 35, 292.5, 45);
        arc34.setType(ArcType.ROUND);
        arc34.setFill(Color.RED);

        cPane3.setAlignment(Pos.CENTER);

        cPane3.add(arc31, 0, 0);
        cPane3.add(arc32, 0, 1);
        cPane3.add(arc33, 1, 0);
        cPane3.add(arc34, 1, 1);

        gPane.add(cPane3, 1, 0);

        Arc arc41 = new Arc(0, 0, 35, 35, 112.5, 45);
        arc41.setType(ArcType.ROUND);
        arc41.setFill(Color.RED);
        Arc arc42 = new Arc(0, 0, 35, 35, 202.5, 45);
        arc42.setType(ArcType.ROUND);
        arc42.setFill(Color.RED);
        Arc arc43 = new Arc(0, 0, 35, 35, 22.5, 45);
        arc43.setType(ArcType.ROUND);
        arc43.setFill(Color.RED);
        Arc arc44 = new Arc(0, 0, 35, 35, 292.5, 45);
        arc44.setType(ArcType.ROUND);
        arc44.setFill(Color.RED);

        cPane4.setAlignment(Pos.CENTER);

        cPane4.add(arc41, 0, 0);
        cPane4.add(arc42, 0, 1);
        cPane4.add(arc43, 1, 0);
        cPane4.add(arc44, 1, 1);

        gPane.add(cPane4, 1, 1);

        Scene scene = new Scene(gPane);

        primaryStage.setTitle("Lab 09");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
