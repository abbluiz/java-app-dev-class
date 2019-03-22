package lab02;

/** (Enable GeometricObject comparable)
 * 
 * Modify the GeometricObject class to implement the Comparable interface. 
 * Define a static max method in the GeometricObject class for finding the larger of two GeometricObject instances.
 * If both the GeometricObject instances are equal, max method return the first given GeometricObject instance.
 * Write a test program such that:
 	* Creates two Circle objects called circle1 (radius = 5) and circle2 (radius = 4)
 	* Creates two Rectangle objects called rectangle1 (width = 5 and height = 4) and rectangle2 (width = 4 and height = 5)
 	* Use the max method to find the larger of two circles and display its radius
 	* Use the max method to find the larger of two rectangles and display its width and height
 	* Use the max method to find the larger of (circle1, rectangle1) and display its fields (either radius or width/height).
 	* 
 * Note: You are not allowed to change the Circle and Rectangle class.
 */

public class Lab02 {
	// Main method
	public static void main(String[] args) {
		// TO DO: Write your test program here

		Circle circle1 = new Circle(5.0);
		Circle circle2 = new Circle(4.0);

		Rectangle rectangle1 = new Rectangle(5.0, 4.0);
		Rectangle rectangle2 = new Rectangle(4.0, 5.0);

		GeometricObject larger1 = GeometricObject.max(circle1, circle2);
		GeometricObject larger2 = GeometricObject.max(rectangle1, rectangle2);
		GeometricObject larger3 = GeometricObject.max(circle1, rectangle1);

		System.out.println(larger1);
		System.out.println(larger2);
		System.out.println(larger3);

	}
}

// TO DO: Modify GeometricObject class
abstract class GeometricObject implements Comparable<GeometricObject> {
	protected String color;
	protected double weight;

	// Default construct
	protected GeometricObject() {
		color = "white";
		weight = 1.0;
	}

	// Construct a geometric object
	protected GeometricObject(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	@Override
	public int compareTo(GeometricObject o) {

		return Double.compare(this.getArea(), o.getArea());

	}

	// Getter method for color
	public String getColor() {
		return color;
	}

	// Setter method for color
	public void setColor(String color) {
		this.color = color;
	}

	// Getter method for weight
	public double getWeight() {
		return weight;
	}

	// Setter method for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// Abstract method
	public abstract double getArea();

	// Abstract method
	public abstract double getPerimeter();

	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		// TO DO: Implement this method to find the larger of two GeometricObject instances
		// Hint: You can use the compareTo method to implement this max method.
		if (o1.compareTo(o2) >= 0)
			return o1;
		else
			return o2;

	}
}

// Circle.java: The circle class that extends GeometricObject
class Circle extends GeometricObject {
	protected double radius;

	// Default constructor
	public Circle() {
		this(1.0, "white", 1.0);
	}

	// Construct circle with specified radius
	public Circle(double radius) {
		super("white", 1.0);
		this.radius = radius;
	}

	// Construct a circle with specified radius, weight, and color
	public Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	// Getter method for radius
	public double getRadius() {
		return radius;
	}

	// Setter method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Implement the findArea method defined in GeometricObject
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// Implement the findPerimeter method defined in GeometricObject
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// Override the equals() method defined in the Object class
	@Override
	public boolean equals(Object circle) {
		return this.radius == ((Circle) circle).getRadius();
	}

	@Override
	public String toString() {
		return "[Circle] radius = " + radius;
	}

}

class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "[rectangle] width: " + width + " height: " + height;
	}
}
