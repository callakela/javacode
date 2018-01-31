package com;

public class ReverseList {

	public static Node reverseList(Node head){
		 Node next=null,prev=null;
		 
		 while(head!=null){
			 next=head.next;
			 head.next=prev;
			 prev=head;
			 head=next;
		 }
		return prev;
	}
	
	public static void insertIntoList(Node head,int data){
		
		while(head.next!=null)
			head=head.next;
		
		head.next=new Node(data);
	}
	
	public static void printList(Node head){
		while(head!=null){
			
			System.out.println(" "+head.data);
			head=head.next;
		}
	}
	public static void printReverseLinkedList(Node head) {
		if (null == head) {
			return;
		}
		printReverseLinkedList(head.next);
		System.out.printf("%d ", head.data);
	}
}
