package assignment1;

public class A1Q3 {
	public static void main(String[] args) {
		// TO DO: Write the test program here ...
		Octagon octagon1 = new Octagon(5.0);

		Octagon octagon2 = (Octagon)octagon1.clone();
//		Octagon octagon2 = new Octagon(4.0);
//		Octagon octagon2 = new Octagon(6.0);

		System.out.println(octagon1);
		System.out.println("Its perimeter is " + octagon1.getPerimeter());
		System.out.println("Its area is " + octagon1.getArea() + "\n");

		System.out.println(octagon2);
		System.out.println("Its perimeter is " + octagon2.getPerimeter());
		System.out.println("Its area is " + octagon2.getArea() + "\n");

		if (octagon1.compareTo(octagon2) == 0)
			System.out.println("Both octagons are equal.");
		else if (octagon1.compareTo(octagon2) < 0)
			System.out.println("First octagon is less than second.");
		else
			System.out.println("First octagon is more than first.");


	}
}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	// TO DO: Implement the Octagon class by extending the GeometricObject
	// and implementing the Comparable and Cloneable interfaces
	private double side = 1.0;

	public Octagon() { super(); }

	public Octagon(double side) {

		super();

		this.side = side;

	}

	public Octagon(String color, boolean isFilled, double side) {

		super(color, isFilled);

		this.side = side;
	}

	public double getSide() { return this.side; }

	public double getPerimeter() { return this.side * 8.0; }

	public double getArea() {

		return 2.0 * (1.0 + Math.sqrt(2.0)) * Math.pow(this.side, 2.0);

	}

	@Override
	public String toString() {

		return "Octagon: side = " + this.side + " " + super.toString();

	}

	@Override
	public int compareTo(Octagon o) { return Double.compare(this.getArea(), o.getArea()); }

	@Override
	public Object clone() {

		return (new Octagon(this.getColor(), this.isFilled(), this.side));

	}

}