package com.graph;

import java.util.LinkedList;

public class BinaryTree {

	public int root;
	public BinaryTree left = null;
	public BinaryTree right = null;

	public BinaryTree(int root){
		this.root = root;
	}

	public void add(int value){
		if(value < root){
			if(left == null){
				left = new BinaryTree(value);
			}else{
				left.add(value);
			}
		}
		else if(value > root){
			if(right == null){
				right = new BinaryTree(value);
			} else {
				right.add(value);
			}
		}
	}

	public void inOrderTraversal(){
		if(left != null){
			left.inOrderTraversal();
		}
		System.out.print(root + " ");
		if(right != null){
			right.inOrderTraversal();
		}
	}

	public void postOrderTraversal(){
		if(left != null){
			left.postOrderTraversal();
		}
		if(right != null){
			right.postOrderTraversal();
		}
		System.out.print(root + " ");
	}

	public void preOrderTraversalDFS(){
		System.out.print(root + " ");
		if(left != null){
			left.preOrderTraversalDFS();
		}
		if(right != null){
			right.preOrderTraversalDFS();
		}
	}

	public void levelOrderTraversalBFS(){
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(this);

		while(queue.peek() != null){
			BinaryTree tree = queue.pop();
			System.out.print(tree.root + " ");
			if(tree.left != null){
				queue.add(tree.left);
			}
			if(tree.right != null){
				queue.add(tree.right);
			}
		}
	}
}
