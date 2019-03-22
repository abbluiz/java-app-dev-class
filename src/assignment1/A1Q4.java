package assignment1;

public class A1Q4 {
	public static void main(String[] args) throws Exception {
		// TO DO: Write the test program here ...

		TriangleWithException notARealTriangle = new TriangleWithException(4.0, 8.0, 3.0);

		System.out.println("It seems the triangle it's real after all...\n" + notARealTriangle);

	}
}

class IllegalTriangleException extends Exception {
	// TO DO: Implement the IllegalTriangleException class by extending Exception class

	public IllegalTriangleException(String message) { super(message); }

}

class TriangleWithException extends GeometricObject {
	// TO DO: Implement the TriangleWithException class here
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public TriangleWithException() { super(); }

	public TriangleWithException(double side1, double side2, double side3) throws IllegalTriangleException {

		super();

		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
			throw new IllegalTriangleException("Triangle Inequality Theorem violated: " +
					"side1 = " + side1 + "; side2 = " + side2 + "; side3 = " + side3);

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public TriangleWithException(String color, boolean isFilled, double side1, double side2, double side3)
			throws IllegalTriangleException {

		super(color, isFilled);

		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
			throw new IllegalTriangleException("Triangle Inequality Theorem violated.");

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

		return "Triangle: side1 = " + this.side1 + "; side2 = " + this.side2 + "; side3 = " + this.side3 + " "
				+ super.toString();

	}
}

