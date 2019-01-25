package com.graph;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonEmptyBSTTest {


	@Test
	public void isEmpty() {
		NonEmptyBST<Integer> tree = new NonEmptyBST<>(8);
		tree.add(7);
		tree.add(9);
		assertEquals(false, tree.isEmpty());
	}

	@Test
	public void cardinality() {

	}

	@Test
	public void contains() {
		NonEmptyBST<Integer> tree = new NonEmptyBST<>(8);
		tree = tree.add(7);
		tree = tree.add(9);
		tree = tree.add(11);
		tree = tree.add(10);
		tree = tree.add(6);
		assertEquals(true, tree.contains(7));
		assertEquals(true, tree.contains(10));
	}

	@Test
	public void add() {
		NonEmptyBST<Integer> tree = new NonEmptyBST<>(8);
		tree = tree.add(7);
		tree = tree.add(9);
		tree = tree.add(11);
		tree = tree.add(10);
		tree = tree.add(6);
		assertEquals(true, tree.contains(7));
		assertEquals(true, tree.contains(10));


	}
}