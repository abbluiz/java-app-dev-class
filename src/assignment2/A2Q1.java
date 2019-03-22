package assignment2;

import java.util.LinkedHashSet;

public class A2Q1 {
	public static void main(String[] args) {
		// TO DO: Write your application here ...
		LinkedHashSet<String> a = new LinkedHashSet<>();
		LinkedHashSet<String> b = new LinkedHashSet<>();

		a.add("George");
		a.add("Jim");
		a.add("John");
		a.add("Blake");
		a.add("Kevin");
		a.add("Michael");

		System.out.println("Set A: " + a);

		b.add("George");
		b.add("Katie");
		b.add("Kevin");
		b.add("Michelle");
		b.add("Ryan");

		System.out.println("Set B: " + b + "\n");

		LinkedHashSet<String> union = new LinkedHashSet<>(a);
		union.addAll(b);
		System.out.println("Union: " + union);

		LinkedHashSet<String> difference = new LinkedHashSet<>(a);
		difference.removeAll(b);
		System.out.println("Difference: " + difference);

		LinkedHashSet<String> intersection = new LinkedHashSet<>(a);
		intersection.retainAll(b);
		System.out.println("Intersection: " + intersection);

	}
}
