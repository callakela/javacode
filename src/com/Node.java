
public class Node {
	
	int data;
		
	Node prev,next;
	
	public Node(int data){
		
		 this.data=data;
		 prev=null;
		 next=null;
		
	}
	
	public Node(int data,Node n,Node p){
		
		 this.data=data;
		 prev=p;
		 next=n;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
