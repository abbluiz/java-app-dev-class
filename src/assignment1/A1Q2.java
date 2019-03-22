package assignment1;

import java.util.Scanner;

public class A1Q2 {
	public static void main(String[] args) {
		// TO DO: Write the test program here ...
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter three sides of the triangle, a color and true if");
		System.out.println("triangle is filled or false if it's not");

		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		String color = input.next();

		boolean isFilled = input.nextBoolean();

		Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);

		System.out.println(triangle);
		System.out.println("Its perimeter is " + triangle.getPerimeter());
		System.out.println("Its area is " + triangle.getArea());

	}
}

class Triangle extends GeometricObject {
	// TO DO: Implement the assignment1.Triangle class by extending the assignment1.GeometricObject class ...
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() { super(); }

	public Triangle(double side1, double side2, double side3) {

		super();

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public Triangle(String color, boolean isFilled, double side1, double side2, double side3) {

		super(color, isFilled);

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public double getSide1() { return this.side1; }
	public double getSide2() { return this.side2; }
	public double getSide3() { return this.side3; }

	public double getPerimeter() { return this.side1 + this.side2 + this.side3; }

	public double getArea() {

		double s = (this.side1 + this.side2 + this.side3) / 2.0;

		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));

	}

	@Override
	public String toString() {

		return "assignment1.Triangle: side1 = " + this.side1 + "; side2 = " + this.side2 + "; side3 = " + this.side3 + " "
				+ super.toString();

	}

}

class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
