package com.graph;

public interface BinarySearchTree<D extends Comparable> {
	public boolean isEmpty();
	public int cardinality();
	public boolean contains(D element);
	public NonEmptyBST<D> add(D elt);
	public BinarySearchTree getLeft();
	public void setLeft(BinarySearchTree<D> elt);


}
