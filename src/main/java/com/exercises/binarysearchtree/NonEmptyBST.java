package com.exercises.binarysearchtree;

public class NonEmptyBST<D extends Comparable> implements BinarySearchTree<D>{
	D data = null;
	BinarySearchTree left;
	BinarySearchTree right;

	public NonEmptyBST(D elt){
		data = elt;
		left = new EmptyBST();
		right = new EmptyBST();
	}

	public NonEmptyBST(D elt, BinarySearchTree<D> leftTree, BinarySearchTree<D> rightTree){
		data = elt;
		left = leftTree;
		right = rightTree;
	}

	@Override
	public BinarySearchTree getLeft() {
		return left;
	}

	@Override
	public void setLeft(BinarySearchTree<D> elt) {
		this.left = elt;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}

	@Override
	public boolean contains(D element) {
		if (data == element){
			return true;
		} else {
			if (element.compareTo(data) < 0){
				return left.contains(element);
			} else {
				return right.contains(element);
			}
		}
	}

	@Override
	public NonEmptyBST<D> add(D elt) {
		if( data == elt){
			return this;
		} else {
			if(elt.compareTo(data) < 0 ){
				return new NonEmptyBST(data,left.add(elt),right);
			} else {
				return new NonEmptyBST(data,left,right.add(elt));
			}
		}
	}
}
