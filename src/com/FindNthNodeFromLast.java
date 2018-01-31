package com;

public class FindNthNodeFromLast {
	
	public static Node findNthNodeFromLast(Node head,int n ){
		 Node slow=head,fast=head;
		 int index=0;
		 while(index++<n){
			 if(fast==null){
				return null; 
			 }
			  fast=fast.next; 
		 }
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	public static void insert(Node head, int data) {
		while (head.next != null)
			head = head.next;
		head.next = new Node(data);
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
