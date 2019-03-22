package assignment1;

public class A1Q1 {
	public static void main(String[] args) {
		// TO DO: Write the client program here to test all methods in MyInteger class
		String stringInt = "343";
		char[] charsInt = {'3', '4', '3'};

		MyInteger integer1 = new MyInteger(3);
		MyInteger integer2 = new MyInteger(118);
		MyInteger integer3 = new MyInteger(MyInteger.parseInt(stringInt));
		MyInteger integer4 = new MyInteger(MyInteger.parseInt(charsInt));
		MyInteger integer5 = new MyInteger(MyInteger.parseInt("3"));

		System.out.println(integer3.getValue());

		System.out.println(integer1);
		System.out.println(integer2);
		System.out.println(integer3);
		System.out.println(integer4);
		System.out.println(integer5);

		if (integer2.isEven())
			System.out.println(integer2 + " is even");
		else
			System.out.println(integer2 + " is odd");

		if (integer3.isOdd())
			System.out.println(integer3 + " is odd");
		else
			System.out.println(integer3 + " is even");

		if(integer1.equals(integer5))
			System.out.println(integer1 + " = " + integer5);
		else
			System.out.println(integer1 + " != " + integer5);

		if(integer2.equals(200))
			System.out.println(integer2 + " = 200");
		else
			System.out.println(integer2 + " != 200");

		MyInteger negativeInt = new MyInteger(MyInteger.parseInt("-11800"));


		if (MyInteger.isEven(new MyInteger(-3)))
			System.out.println("-3 is even");
		else if(MyInteger.isOdd(new MyInteger(-3)))
			System.out.println("-3 is odd");

		if (negativeInt.isEven())
			System.out.println(negativeInt + " is even");
		else
			System.out.println(negativeInt + " is odd");

		if (MyInteger.isEven(-9000))
			System.out.println("-9000 is even");
		else if(MyInteger.isOdd(8000))
			System.out.println("8000 is odd");

	}
}

class MyInteger {
	// TO DO: Implement the MyInteger class here ...

	private int value;

	public MyInteger(int value) { this.value = value; }

	public int getValue() { return this.value; }

	public boolean isEven() { return this.value % 2 == 0; }

	public boolean isOdd() { return this.value % 2 != 0; }

	public static boolean isEven(int value) { return value % 2 == 0; }

	public static boolean isOdd(int value) { return value % 2 != 0; }

	public static boolean isEven(MyInteger integer) { return integer.value % 2 == 0; }

	public static boolean isOdd(MyInteger integer) { return integer.value % 2 != 0; }

	public boolean equals(int value) { return this.value == value; }

	public boolean equals(MyInteger integer) { return this.value == integer.value; }

	public static int parseInt(char[] integer) {

		int parsedInt = 0;

		if (integer[0] == '-' || integer[0] == '+') {

			for (int i = 1; i < integer.length; i++) {

				parsedInt += ((int)integer[i] - 48) * ((int)Math.pow(10, integer.length - i - 1));

			}

		} else {

			for (int i = 0; i < integer.length; i++) {

				parsedInt += ((int)integer[i] - 48) * ((int)Math.pow(10, integer.length - i - 1));

			}

		}

		if (integer[0] == '-')
			return -parsedInt;
		else
			return parsedInt;

	}

	public static int parseInt(String integer) { return MyInteger.parseInt(integer.toCharArray()); }

	@Override
	public String toString() { return Integer.toString(this.value); }

}
