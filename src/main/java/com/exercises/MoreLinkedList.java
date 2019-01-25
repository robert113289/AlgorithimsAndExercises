package com.exercises;

//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
public class MoreLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}

	}

	public static Node removeDuplicates(Node head) {
		//Write your code here
		Node node = head;
		while(node != null){
			Node temp = node;
			while(node.next != null && temp.data == node.next.data){
				node = node.next;
			}
			temp.next = node.next;
			node = node.next;
		}
		return head;
	}

	public static Node insert(Node head,int data)
	{

		Node p = new Node(data);
		if(head==null)
			head=p;
		else if(head.next==null)
			head.next=p;
		else
		{
			Node start=head;
			while(start.next!=null)
				start=start.next;
			start.next=p;

		}
		return head;
	}
}
