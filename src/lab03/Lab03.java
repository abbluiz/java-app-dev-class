/*
 * (The Queue class) 
 * You have seen a class for Stack.
 * Design a class named Queue for storing integers.
 * Like a stack, a queue holds elements.
 * In a stack, the elements are retrieved in a last-in first-out fashion.
 * In a queue, the elements are retrieved in a first-in first-out fashion.
 * The class contains:
	* An int[] data field named elements that stores the int values in the queue.
	* A data field named size that stores the number of elements in the queue.
	* A constructor that creates a Queue object with default capacity 8.
	* The method enqueue(int v) that adds v into the queue.
	* The method dequeue() that removes and returns the element from the queue.
	* The method empty() that returns true if the queue is empty.
	* The method getSize() that returns the size of the queue.
	
 * Implement the class with the initial array size set to 8.
 * The array size will be doubled once the number of the elements exceeds the size.
 * After an element is removed from the beginning of the array, you need to shift all elements in the array one position the left.
 * Write a test program that adds 20 numbers from 1 to 20 into the queue then removes these numbers and displays them.
 */

package lab03;

public class Lab03 {
	public static void main(String[] args) {
		// TO DO: Write your test application here ...

		Queue queue = new Queue();

		for(int i = 1; i <= 20; i++) {

			queue.enqueue(i);

		}

		for(int i = 1; i <= 20; i++) {

			System.out.println(queue.dequeue());

		}

	}
}

class Queue {
	// TO DO: Define data fields here ...
	private int[] elements;
	private int size = 0;
	public static final int DEFAULT_CAPACITY = 8;

	// TO DO: Define constructor that constructs a queue with the default capacity 8 ...
	public Queue() { this(Queue.DEFAULT_CAPACITY); }

	public Queue(int capacity) { this.elements = new int[capacity]; }

	/** Add a new integer into the queue */
	public void enqueue(int value) {
		// TO DO: Implement this method according to instruction.
		int[] temp;

		if (this.elements.length >= this.size + 1) {

			temp = new int[this.elements.length];

		} else {

			temp = new int[this.elements.length * 2];

		}

		System.arraycopy(this.elements, 0, temp, 1, this.size);

		temp[0] = value;

		this.elements = temp;

		this.size++;

	}

	/** Remove and return an element from the queue */
	public int dequeue() {
		// TO DO: Implement this method according to instruction.
		if (!this.empty()) {

			int temp = this.elements[this.size-1];

			this.size--;

			return temp;
		}
		return 0; // TO DO: Modify the return statement according to the implementation
	}

	/** Test whether the queue is empty */
	public boolean empty() {
		// TO DO: Implement this method according to instruction.
		return this.size == 0; // TO DO: Modify the return statement according to the implementation
	}

	/** Return the number of elements in the queue */
	public int getSize() {
		// TO DO: Implement this method according to instruction.
		return this.size; // TO DO: Modify the return statement according to the implementation
	}
}
