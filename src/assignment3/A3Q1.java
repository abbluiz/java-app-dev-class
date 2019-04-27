package assignment3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class A3Q1 extends Application {
	@Override
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// TO DO: Write your JavaFX application here ..

		double radius = 200.0;
		double centerPos = 250.0;
		double hourTrace = 14.0;
		double minutesTrace = hourTrace/2.0;
		double numSpacingBottom = 28.0;

		Circle outerCircle = new Circle();
		outerCircle.setCenterX(centerPos);
		outerCircle.setCenterY(centerPos);
		outerCircle.setRadius(radius);
		outerCircle.setStroke(Color.BLACK);
		outerCircle.setFill(Color.WHITE);

		Line $12_12 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(84))),
				centerPos - (radius * Math.sin(Math.toRadians(84))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(84))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(84))));
		Line $12_24 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(78))),
				centerPos - (radius * Math.sin(Math.toRadians(78))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(78))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(78))));
		Line $12_36 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(72))),
				centerPos - (radius * Math.sin(Math.toRadians(72))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(72))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(72))));
		Line $12_48 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(66))),
				centerPos - (radius * Math.sin(Math.toRadians(66))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(66))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(66))));
		Line $1 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(60))),
				centerPos - (radius * Math.sin(Math.toRadians(60))),
				centerPos + ((radius - hourTrace) * Math.cos(Math.toRadians(60))),
				centerPos - ((radius - hourTrace) * Math.sin(Math.toRadians(60))));
		Text $1_num = new Text(
				centerPos + ((radius - numSpacingBottom) * Math.cos(Math.toRadians(60))),
				centerPos - ((radius - numSpacingBottom) * Math.sin(Math.toRadians(60))),
				"1");

		Line $1_12 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(54))),
				centerPos - (radius * Math.sin(Math.toRadians(54))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(54))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(54))));
		Line $1_24 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(48))),
				centerPos - (radius * Math.sin(Math.toRadians(48))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(48))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(48))));
		Line $1_36 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(42))),
				centerPos - (radius * Math.sin(Math.toRadians(42))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(42))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(42))));
		Line $1_48 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(36))),
				centerPos - (radius * Math.sin(Math.toRadians(36))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(36))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(36))));
		Line $2 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(30))),
				centerPos - (radius * Math.sin(Math.toRadians(30))),
				centerPos + ((radius - hourTrace) * Math.cos(Math.toRadians(30))),
				centerPos - ((radius - hourTrace) * Math.sin(Math.toRadians(30))));
		Text $2_num = new Text(
				centerPos + ((radius - numSpacingBottom) * Math.cos(Math.toRadians(30))),
				centerPos - ((radius - numSpacingBottom) * Math.sin(Math.toRadians(30))),
				"2");

		Line $2_12 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(24))),
				centerPos - (radius * Math.sin(Math.toRadians(24))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(24))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(24))));
		Line $2_24 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(18))),
				centerPos - (radius * Math.sin(Math.toRadians(18))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(18))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(18))));
		Line $2_36 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(12))),
				centerPos - (radius * Math.sin(Math.toRadians(12))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(12))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(12))));
		Line $2_48 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(6))),
				centerPos - (radius * Math.sin(Math.toRadians(6))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(6))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(6))));
		Line $3 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(0))),
				centerPos - (radius * Math.sin(Math.toRadians(0))),
				centerPos + ((radius - hourTrace) * Math.cos(Math.toRadians(0))),
				centerPos - ((radius - hourTrace) * Math.sin(Math.toRadians(0))));
		Text $3_num = new Text(
				centerPos + ((radius - numSpacingBottom) * Math.cos(Math.toRadians(0))),
				centerPos - ((radius - numSpacingBottom) * Math.sin(Math.toRadians(0))),
				"3");

		Line $3_12 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(6))),
				centerPos + (radius * Math.sin(Math.toRadians(6))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(6))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(6))));
		Line $3_24 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(12))),
				centerPos + (radius * Math.sin(Math.toRadians(12))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(12))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(12))));
		Line $3_36 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(18))),
				centerPos + (radius * Math.sin(Math.toRadians(18))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(18))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(18))));
		Line $3_48 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(24))),
				centerPos + (radius * Math.sin(Math.toRadians(24))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(24))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(24))));
		Line $4 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(30))),
				centerPos + (radius * Math.sin(Math.toRadians(30))),
				centerPos + ((radius - hourTrace) * Math.cos(Math.toRadians(30))),
				centerPos + ((radius - hourTrace) * Math.sin(Math.toRadians(30))));
		Text $4_num = new Text(
				centerPos + ((radius - numSpacingBottom) * Math.cos(Math.toRadians(30))),
				centerPos + ((radius - numSpacingBottom) * Math.sin(Math.toRadians(30))),
				"4");

		Line $4_12 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(36))),
				centerPos + (radius * Math.sin(Math.toRadians(36))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(36))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(36))));
		Line $4_24 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(42))),
				centerPos + (radius * Math.sin(Math.toRadians(42))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(42))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(42))));
		Line $4_36 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(48))),
				centerPos + (radius * Math.sin(Math.toRadians(48))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(48))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(48))));
		Line $4_48 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(54))),
				centerPos + (radius * Math.sin(Math.toRadians(54))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(54))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(54))));
		Line $5 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(60))),
				centerPos + (radius * Math.sin(Math.toRadians(60))),
				centerPos + ((radius - hourTrace) * Math.cos(Math.toRadians(60))),
				centerPos + ((radius - hourTrace) * Math.sin(Math.toRadians(60))));
		Text $5_num = new Text(
				centerPos + ((radius - numSpacingBottom) * Math.cos(Math.toRadians(60))),
				centerPos + ((radius - numSpacingBottom) * Math.sin(Math.toRadians(60))),
				"5");

		Line $5_12 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(66))),
				centerPos + (radius * Math.sin(Math.toRadians(66))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(66))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(66))));
		Line $5_24 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(72))),
				centerPos + (radius * Math.sin(Math.toRadians(72))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(72))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(72))));
		Line $5_36 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(78))),
				centerPos + (radius * Math.sin(Math.toRadians(78))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(78))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(78))));
		Line $5_48 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(84))),
				centerPos + (radius * Math.sin(Math.toRadians(84))),
				centerPos + ((radius - minutesTrace) * Math.cos(Math.toRadians(84))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(84))));
		Line $6 = new Line(
				centerPos + (radius * Math.cos(Math.toRadians(90))),
				centerPos + (radius * Math.sin(Math.toRadians(90))),
				centerPos + ((radius - hourTrace) * Math.cos(Math.toRadians(90))),
				centerPos + ((radius - hourTrace) * Math.sin(Math.toRadians(90))));
		Text $6_num = new Text(
				centerPos + ((radius - numSpacingBottom) * Math.cos(Math.toRadians(90))),
				centerPos + ((radius - numSpacingBottom) * Math.sin(Math.toRadians(90))),
				"6");

		Line $6_12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(84))),
				centerPos + (radius * Math.sin(Math.toRadians(84))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(84))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(84))));
		Line $6_24 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(78))),
				centerPos + (radius * Math.sin(Math.toRadians(78))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(78))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(78))));
		Line $6_36 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(72))),
				centerPos + (radius * Math.sin(Math.toRadians(72))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(72))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(72))));
		Line $6_48 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(66))),
				centerPos + (radius * Math.sin(Math.toRadians(66))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(66))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(66))));
		Line $7 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(60))),
				centerPos + (radius * Math.sin(Math.toRadians(60))),
				centerPos - ((radius - hourTrace) * Math.cos(Math.toRadians(60))),
				centerPos + ((radius - hourTrace) * Math.sin(Math.toRadians(60))));
		Text $7_num = new Text(
				centerPos - ((radius - numSpacingBottom) * Math.cos(Math.toRadians(60))),
				centerPos + ((radius - numSpacingBottom) * Math.sin(Math.toRadians(60))),
				"7");

		Line $7_12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(54))),
				centerPos + (radius * Math.sin(Math.toRadians(54))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(54))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(54))));
		Line $7_24 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(48))),
				centerPos + (radius * Math.sin(Math.toRadians(48))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(48))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(48))));
		Line $7_36 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(42))),
				centerPos + (radius * Math.sin(Math.toRadians(42))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(42))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(42))));
		Line $7_48 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(36))),
				centerPos + (radius * Math.sin(Math.toRadians(36))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(36))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(36))));
		Line $8 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(30))),
				centerPos + (radius * Math.sin(Math.toRadians(30))),
				centerPos - ((radius - hourTrace) * Math.cos(Math.toRadians(30))),
				centerPos + ((radius - hourTrace) * Math.sin(Math.toRadians(30))));
		Text $8_num = new Text(
				centerPos - ((radius - numSpacingBottom) * Math.cos(Math.toRadians(30))),
				centerPos + ((radius - numSpacingBottom) * Math.sin(Math.toRadians(30))),
				"8");

		Line $8_12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(24))),
				centerPos + (radius * Math.sin(Math.toRadians(24))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(24))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(24))));
		Line $8_24 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(18))),
				centerPos + (radius * Math.sin(Math.toRadians(18))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(18))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(18))));
		Line $8_36 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(12))),
				centerPos + (radius * Math.sin(Math.toRadians(12))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(12))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(12))));
		Line $8_48 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(6))),
				centerPos + (radius * Math.sin(Math.toRadians(6))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(6))),
				centerPos + ((radius - minutesTrace) * Math.sin(Math.toRadians(6))));
		Line $9 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(0))),
				centerPos + (radius * Math.sin(Math.toRadians(0))),
				centerPos - ((radius - hourTrace) * Math.cos(Math.toRadians(0))),
				centerPos + ((radius - hourTrace) * Math.sin(Math.toRadians(0))));
		Text $9_num = new Text(
				centerPos - ((radius - numSpacingBottom) * Math.cos(Math.toRadians(0))),
				centerPos + ((radius - numSpacingBottom) * Math.sin(Math.toRadians(0))),
				"9");

		Line $9_12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(6))),
				centerPos - (radius * Math.sin(Math.toRadians(6))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(6))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(6))));
		Line $9_24 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(12))),
				centerPos - (radius * Math.sin(Math.toRadians(12))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(12))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(12))));
		Line $9_36 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(18))),
				centerPos - (radius * Math.sin(Math.toRadians(18))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(18))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(18))));
		Line $9_48 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(24))),
				centerPos - (radius * Math.sin(Math.toRadians(24))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(24))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(24))));
		Line $10 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(30))),
				centerPos - (radius * Math.sin(Math.toRadians(30))),
				centerPos - ((radius - hourTrace) * Math.cos(Math.toRadians(30))),
				centerPos - ((radius - hourTrace) * Math.sin(Math.toRadians(30))));
		Text $10_num = new Text(
				centerPos - ((radius - numSpacingBottom) * Math.cos(Math.toRadians(30))),
				centerPos - ((radius - numSpacingBottom) * Math.sin(Math.toRadians(30))),
				"10");

		Line $10_12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(36))),
				centerPos - (radius * Math.sin(Math.toRadians(36))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(36))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(36))));
		Line $10_24 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(42))),
				centerPos - (radius * Math.sin(Math.toRadians(42))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(42))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(42))));
		Line $10_36 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(48))),
				centerPos - (radius * Math.sin(Math.toRadians(48))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(48))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(48))));
		Line $10_48 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(54))),
				centerPos - (radius * Math.sin(Math.toRadians(54))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(54))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(54))));
		Line $11 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(60))),
				centerPos - (radius * Math.sin(Math.toRadians(60))),
				centerPos - ((radius - hourTrace) * Math.cos(Math.toRadians(60))),
				centerPos - ((radius - hourTrace) * Math.sin(Math.toRadians(60))));
		Text $11_num = new Text(
				centerPos - ((radius - numSpacingBottom) * Math.cos(Math.toRadians(60))),
				centerPos - ((radius - numSpacingBottom) * Math.sin(Math.toRadians(60))),
				"11");

		Line $11_12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(66))),
				centerPos - (radius * Math.sin(Math.toRadians(66))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(66))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(66))));
		Line $11_24 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(72))),
				centerPos - (radius * Math.sin(Math.toRadians(72))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(72))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(72))));
		Line $11_36 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(78))),
				centerPos - (radius * Math.sin(Math.toRadians(78))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(78))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(78))));
		Line $11_48 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(84))),
				centerPos - (radius * Math.sin(Math.toRadians(84))),
				centerPos - ((radius - minutesTrace) * Math.cos(Math.toRadians(84))),
				centerPos - ((radius - minutesTrace) * Math.sin(Math.toRadians(84))));
		Line $12 = new Line(
				centerPos - (radius * Math.cos(Math.toRadians(90))),
				centerPos - (radius * Math.sin(Math.toRadians(90))),
				centerPos - ((radius - hourTrace) * Math.cos(Math.toRadians(90))),
				centerPos - ((radius - hourTrace) * Math.sin(Math.toRadians(90))));
		Text $12_num = new Text(
				centerPos - ((radius - numSpacingBottom) * Math.cos(Math.toRadians(90))),
				centerPos - ((radius - numSpacingBottom) * Math.sin(Math.toRadians(90))),
				"12");

		Pane pane = new Pane();
		pane.getChildren().addAll(
				outerCircle,
				$12_12, $12_24, $12_36, $12_48, $1, $1_num,
				$1_12, $1_24, $1_36, $1_48, $2, $2_num,
				$2_12, $2_24, $2_36, $2_48, $3, $3_num,
				$3_12, $3_24, $3_36, $3_48, $4, $4_num,
				$4_12, $4_24, $4_36, $4_48, $5, $5_num,
				$5_12, $5_24, $5_36, $5_48, $6, $6_num,
				$6_12, $6_24, $6_36, $6_48, $7, $7_num,
				$7_12, $7_24, $7_36, $7_48, $8, $8_num,
				$8_12, $8_24, $8_36, $8_48, $9, $9_num,
				$9_12, $9_24, $9_36, $9_48, $10, $10_num,
				$10_12, $10_24, $10_36, $10_48, $11, $11_num,
				$11_12, $11_24, $11_36, $11_48, $12, $12_num);

		Scene scene = new Scene(pane, 500, 500);

		primaryStage.setTitle("A3Q1");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}
}

// TO DO: Write any other class here, if it is required ...
