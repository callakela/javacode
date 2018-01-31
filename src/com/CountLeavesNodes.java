package com;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeavesNodes {
	
	public static int countLeafNodes(NodeT root ){
		
	    int numOfLeafs=0;
	    
	    if (root == null) {
			 return 0;
		}
		Queue<NodeT> queue=new LinkedList<NodeT>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			NodeT node=queue.poll();
			
			if(node.left==null && node.right==null){
				numOfLeafs++;
				continue;
			}
			if(node.left!=null)
				queue.offer(node.left);
			if(node.right!=null)
				queue.offer(node.right);
		}
		System.out.println("numOfLeafs--"+numOfLeafs);
		return numOfLeafs;
	}
	public static void main(String[] args) {
		 NodeT A = NodeT.creatNode(50);
			// Level 1
		 NodeT B = NodeT.creatNode(25);
		 NodeT C = NodeT.creatNode(30);
			// Level 2
			NodeT D = NodeT.creatNode(40);
			NodeT E = NodeT.creatNode(10);
			NodeT F = NodeT.creatNode(30);
			NodeT G = NodeT.creatNode(60);
			
			// connect Level 0 and 1
			A.left = B;
			A.right = C;
			// connect level 1 and level 2
			B.left = D;
			B.right = E;
			C.left = F;
			C.right = G;
			
			countLeafNodes(A);
	}

}

