package com;

public class FindMiddleNode {
	
	public static Node getMiddleNode(Node head){
		 Node fNode=head;
		 Node sNode=head;
		if(null==head)
			return null;
		
		while (fNode != null && fNode.next != null) {
			sNode = sNode.next;
			fNode = fNode.next.next;
		}
		return sNode;
	}
	public static void insert(Node head, int data) {
		 while(head.next!=null)
			 head=head.next;
		 
		     head.next= new Node(data);
		 
	}
	public static void print(Node head) {
		while (head != null) {
			System.out.printf("%d ", head.data);
			head = head.next;
		}
		System.out.println("");
	}
}
