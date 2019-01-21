package com.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoreLinkedListTest {

	@Test
	public void removeDuplicates() {
		MoreLinkedList moreLinkedList = new MoreLinkedList();
		MoreLinkedList.Node head = new MoreLinkedList.Node(1);
		moreLinkedList.insert(head, 2);
		moreLinkedList.insert(head, 2);
		moreLinkedList.insert(head, 3);
		moreLinkedList.insert(head, 3);
		moreLinkedList.insert(head, 4);


		MoreLinkedList.Node result = moreLinkedList.removeDuplicates(head);
		assertEquals(1, result.data);
		MoreLinkedList.Node resultNextNode = result.next;
		assertEquals(2, resultNextNode.data);
		resultNextNode = resultNextNode.next;
		assertEquals(3, resultNextNode.data);
		resultNextNode = resultNextNode.next;
		assertEquals(4, resultNextNode.data);

		head = new MoreLinkedList.Node(1);
		moreLinkedList.insert(head, 1);
		moreLinkedList.insert(head, 1);
		moreLinkedList.insert(head, 1);
		moreLinkedList.insert(head, 1);
		moreLinkedList.insert(head, 1);

		result = moreLinkedList.removeDuplicates(head);
		assertEquals(1, result.data);
		resultNextNode = result.next;
		assertEquals(null, resultNextNode);

	}
}