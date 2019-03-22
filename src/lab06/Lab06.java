package lab06;/*
 * Write an application that stores integers from 0 to 10,000,000 in ascending order
 * (i.e. 0, 1, 2, . . ., 10000000) in an ArrayList and LinkedList.
 * Name these two lists arrayList and linkedList, respectively. 
 * Display the execution time taken for each of the following tasks:
 	* Execution time of getting middle element of arrayList and linkedList using get(int index) method.
 	* Execution time of removing first element from arrayList and linkedList using remove(int index) method.
 	* Execution time of adding 0 to the beginning of arrayList and linkedList using add(int index, E element) method.
 	* Execution time of removing last element from arrayList and linkedList using remove(int index) method.
 * Explain each result in the dedicated area (TO DO) in comments.
 * Note (1): To get the current time at each line, you can use currentTimeMillis() static method from System class.
 * Note (2): To get execution time of each task, get the current time right before and after each task and calculate the difference.
 */

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Lab06 {
	public static void main(String[] args) {		
		// TO DO: Define both lists and store integer in them.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>(arrayList);

		System.out.println("Starting to populate arrayList and linkedList...");

		long startPopulate = currentTimeMillis();

		for (int i = 0; i <= 10000000; i++) {

			arrayList.add(i);
			linkedList.add(i);

		}

		long endPopulate = currentTimeMillis();

		System.out.println("\nFinished populating lists (" + (endPopulate - startPopulate) + " ms)");
		
		// TO DO: Get middle element of both lists and display execution times.
		long startArrayList = currentTimeMillis();

		arrayList.get((arrayList.size()/2) + 1);

		long endArrayList = currentTimeMillis();

		long startLinkedList = currentTimeMillis();

		linkedList.get((arrayList.size()/2) + 1);

		long endLinkedList = currentTimeMillis();


		System.out.println("\nTime to get middle element from arrayList: " + (endArrayList - startArrayList));
		System.out.println("Time to get middle element from linkedList: " + (endLinkedList - startLinkedList));


		/* 
		 * TO DO (Explain Results): An ArrayList is faster because it is works as an array: you can access
		 * its value directly by using the index; while LinkedList are a structure that connects and iterates through
		 * the elements from the first or last element
		 */
		
		
		// TO DO: Remove first element from both lists and display execution times.

		startArrayList = currentTimeMillis();

		arrayList.remove(0);

		endArrayList = currentTimeMillis();

		startLinkedList = currentTimeMillis();

		linkedList.remove(0);

		endLinkedList = currentTimeMillis();

		System.out.println("\nTime to remove first element from arrayList: " + (endArrayList - startArrayList));
		System.out.println("Time to remove first element from linkedList: " + (endLinkedList - startLinkedList));

		/* 
		 * TO DO (Explain Results): LinkedList is faster, because it only saves the index of first and last elements,
		 * while ArrayList must update the indexes for every element
		 */
		
		
		// TO DO: Adding 0 to the beginning of both lists and display execution times.

		startArrayList = currentTimeMillis();

		arrayList.add(0, 0);

		endArrayList = currentTimeMillis();

		startLinkedList = currentTimeMillis();

		linkedList.add(0, 0);

		endLinkedList = currentTimeMillis();

		System.out.println("\nTime to add 0 to start of arrayList: " + (endArrayList - startArrayList));
		System.out.println("Time to add 0 to start of linkedList: " + (endLinkedList - startLinkedList));


		/* 
		 * TO DO (Explain Results): Again, LinkedList is faster because it only needs to update the index of first
		 * and last element and connect it to the list, while ArrayList must update every index
		 */
		
		
		// TO DO: Remove last element from both lists and display execution times.

		startArrayList = currentTimeMillis();

		arrayList.remove(arrayList.size() - 1);

		endArrayList = currentTimeMillis();

		startLinkedList = currentTimeMillis();

		linkedList.remove(linkedList.size() - 1);

		endLinkedList = currentTimeMillis();

		System.out.println("\nTime to remove last element from arrayList: " + (endArrayList - startArrayList));
		System.out.println("Time to remove last element from linkedList: " + (endLinkedList - startLinkedList));

		/* 
		 * TO DO (Explain Results): Both types removes the first element with the same speed, because the ArrayList
		 * won't have to update any other index, while LinkedList just updates the last one
		 */
	}
}
