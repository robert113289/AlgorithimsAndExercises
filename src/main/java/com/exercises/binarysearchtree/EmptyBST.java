package com.exercises.binarysearchtree;



public class EmptyBST<D extends Comparable> implements BinarySearchTree<D> {
	D data = null;
	EmptyBST left;
	EmptyBST right;

	public EmptyBST(){

	}

	@Override
	public boolean isEmpty() {
		return data == null;
	}

	@Override
	public int cardinality() {
		return 0;
	}

	@Override
	public boolean contains(D element) {
		if(data == null){
			return false;
		}
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
		return new NonEmptyBST<D>(elt);
	}
	public D getData() {
		return data;
	}

	@Override
	public BinarySearchTree getLeft() {
		return left;
	}

	@Override
	public void setLeft(BinarySearchTree<D> elt) {

	}
}
