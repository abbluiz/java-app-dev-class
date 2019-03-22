package lab07;/*
 * (Count the occurrences of numbers entered)
 * Write a program that reads an unspecified number of integers and finds the one that has the most occurrences.
 * The input ends when the input is 0.
 * For example, if you entered 2 3 40 3 5 4 �3 3 3 2 0, the number 3 occurred most often.
 * If not one but several numbers have the most occurrences, all of them should be reported.
 * For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
 *
 * Hint #1: Use map to store the number occurrences for each integer.
 * Hint #2: Use values() method from Collection interface to return values as a Collection object.
 * Hint #3: Use max() static method from Collections class to find the maximum value.
 * Hint #4: Use keySet() method from Map interface to returns all keys as a Set object.
 */

import java.util.*;

public class Lab07 {
    public static void main(String[] args) {
        // TO DO: Write your program here ...

        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<>();

        System.out.print("Enter some integers (0 to stop): ");

        int number = input.nextInt();

        while (number != 0) {

            if (m.containsKey(number)) {

                m.put(number, m.get(number) + 1);

            } else {

                m.put(number, 1);

            }

            number = input.nextInt();

        }

        Collection occurrences = m.values();
        int max = (int)Collections.max(occurrences, null);

        Set allNumbers = m.keySet();

        System.out.print("The following number(s) occurred the most (" + max + " times each): ");

        for (Object num : allNumbers) {

            if (m.get(num) == max)
                System.out.print(num + " ");

        }

    }
}
