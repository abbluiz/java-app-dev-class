package assignment3;

import java.util.Scanner;

public class A3Q2 {
	public static void main(String[] args) {
		// TO DO: Write your test application here ...

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two integers: ");

		int m = input.nextInt();
		int n = input.nextInt();

		System.out.println("Their GCD is " + gcd(m, n));

	}

	public static int gcd(int m, int n) {
		// TO DO: Write your recursive method here ...

		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n); // TO DO: Modify the return statement accordingly ...

	}
}
