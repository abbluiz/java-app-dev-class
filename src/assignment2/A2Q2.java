package assignment2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A2Q2 {
	public static void main(String[] args) {
		// TO DO: Write your application here ...

		Scanner input = new Scanner(System.in);
		System.out.print("Enter some words (0 to stop): ");

		String word = input.next();

		Set<Character> vowels = new TreeSet<>();

		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		int consonantCount = 0, vowelCount = 0, otherCount = 0;

		while (!word.equals("0")) {

			char[] array = word.toCharArray();

			for (char c : array) {

				if (vowels.contains(c))
					vowelCount++;
				else if (Character.isLetter(c))
					consonantCount++;
				else
					otherCount++;

			}

			word = input.next();

		}

		System.out.println("\nVowel count: " + vowelCount);
		System.out.println("Consonant count: " + consonantCount);
		System.out.println("Other characters count (except whitespaces and final 0 digit): " + otherCount);

	}
}
