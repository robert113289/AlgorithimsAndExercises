package com.graph;

import com.Search.Binary;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

	//https://www.hackerrank.com/challenges/30-binary-trees/tutorial

	private static BinaryTree tree;
	static {
		tree = new BinaryTree(4);
		tree.add(2);
		tree.add(1);
		tree.add(3);
		tree.add(6);
		tree.add(5);
		tree.add(7);
	}

	@Test
	public void add() {
		assertEquals(2, tree.left.root );
		assertEquals(6, tree.right.root);

		BinaryTree left = tree.left;
		assertEquals(1, left.left.root );
		assertEquals(3, left.right.root);

		BinaryTree right = tree.right;
		assertEquals(5, right.left.root );
		assertEquals(7, right.right.root);

	}

	@Test
	public void inOrderTraversal() {
		// 1 2 3 4 5 6 7
		// The elements are processed in left-root-right order.
		tree.inOrderTraversal();
	}

	@Test
	public void postOrderTraversal() {
		// 1 3 2 5 7 6 4
		//The elements are processed in left-right-root order.
		tree.postOrderTraversal();
	}

	@Test
	public void preOrderTraversalDFS() {
		// 4 2 1 3 6 5 7
		//The elements are processed root-left-right order
		tree.preOrderTraversalDFS();
	}

	@Test
	public void levelOrderTraversalBFS() {
		// 4 2 6 1 3 5 7
		//traversal goes level-by-level
		tree.levelOrderTraversalBFS();
	}
}