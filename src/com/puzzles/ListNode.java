package com.puzzles;

/**
 * Class to represent a list of nodes
 * 
 * @author aethena
 *
 */
public class ListNode {
	private int data;
	private ListNode next;

	/**
	 * Constructor to create a node with data
	 * @param data
	 */
	public ListNode(int data) {
		this.data =data;
	}

	/**
	 * Get data
	 * @return
	 */
	public int getData() {
		return data;
	}

	/**
	 * Set data
	 * @param data
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * Get next node
	 * @return
	 */
	public ListNode getNext() {
		return next;
	}

	/**
	 * Set next node
	 * @param next
	 */
	public void setNext(ListNode next) {
		this.next = next;
	}
}
