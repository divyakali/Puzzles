package com.puzzles;

/**
 * @aethena
 * 
 * 
 *          You are in a room with 100 cups arranged in a big circle. The cups
 *          are numbered sequentially from 1 to 100.
 *
 *          At some point in time, cup #1 will be taken away, and cup #2 will be
 *          skipped. Then cup #3 will be taken away, and cup #4 will be skipped.
 *          This pattern of taking a cup away and skipping the next will keep
 *          going around the circle until there is only one cup left.
 *
 *          Write a program to determine which cup is left. Please send us the
 *          answer and your working code.
 *
 *          Your code should print the answer to the cup challenge when there
 *          are 100 cups.
 */
public class CupChallenge {

	/**
	 * Solves the cup challenge puzzle
	 * 
	 * @param runner
	 * 
	 */
	public static int solvePuzzle(ListNode runner) {
		if (runner == null)
			return -1;
		while (runner != runner.getNext()) {
			System.out.println("Take cup# " + runner.getNext().getData()
					+ " away");
			// Take one cup away by performing a linked list deletion of node
			runner.setNext(runner.getNext().getNext());
			// Skip one cup
			runner = runner.getNext();
			System.out.println("Skip cup# " + runner.getData());

		}
		return runner.getData();
	}

	/**
	 * Creates a circular linked list and returns a pointer to the last node
	 * 
	 * @param num
	 * @return
	 */
	public static ListNode constructCircularList(int num) {

		ListNode head = new ListNode(1);
		ListNode tail = head;
		// create rest the chain of nodes
		for (int i = 2; i <= num; i++) {
			ListNode temp = new ListNode(i);
			tail.setNext(temp);
			tail = tail.getNext();

		}
		// creating a circular linked list by pointing the head to tail
		tail.setNext(head);
		// Circular list begins with a pointer to the last node in the loop.
		// This is so that we can delete the first node in the loop for solving
		// the puzzle
		return tail;

	}

	public static void main(String[] args) {
		// Let's solve the cup challenge
		ListNode tailofCircle = constructCircularList(5);
		int cupNumber = solvePuzzle(tailofCircle);
		System.out.println("The last cup that remains is:" + cupNumber);
	}
}
