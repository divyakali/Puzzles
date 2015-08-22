package com.puzzles;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




public class CupChallengeTest {

	ListNode ctail = null;
	ListNode chead = null;

	@Before
	public void setUp() {
		chead = new ListNode(1);
		initialize(5);
		System.out.println(chead.getData());
		System.out.println(ctail.getData());

	}

	@After
	public void tearDown() {
		chead = null;
		ctail = null;
	}

	@Test
	public void testCircularList() {
		ListNode circularTail = CupChallenge.constructCircularList(5);
		int expectedTailValue = 5;
		int expectedHeadValue = 1;

		Assert.assertEquals(
				"Expected and actual circular lists should end with 5.",
				expectedTailValue, circularTail.getData());
		Assert.assertEquals(
				"Expected and actual circular lists should start with 1.",
				expectedHeadValue, circularTail.getNext().getData());
	}

	@Test
	public void testSolvePuzzleOfFiveCups() {

		int expectedCupNumber = 2;
		int actualCupNumber = CupChallenge.solvePuzzle(ctail);

		Assert.assertEquals(
				"Expected and actual last cup numbers do not match.",
				expectedCupNumber, actualCupNumber);
	}

	@Test
	public void testIsEmpty() {
		int expectedCupNumber = -1;
		ctail = null;
		int actualCupNumber = CupChallenge.solvePuzzle(ctail);
		Assert.assertEquals(
				"Expected and actual last cup numbers do not match.",
				expectedCupNumber, actualCupNumber);

	}

	/**
	 * @param tree
	 * @param values
	 *            set of values to generate the tree to be initialized
	 */
	private void initialize(Integer num) {
		ctail = chead;
		for (int i = 2; i <= num; i++) {
			ctail.setNext(new ListNode(i));
			ctail = ctail.getNext();
		}
		ctail.setNext(chead);
	}

}
