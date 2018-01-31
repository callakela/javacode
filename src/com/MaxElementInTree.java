package com;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInTree {

	 public static int maxElement(NodeT root){
		 
		 if(root == null){
			 return -1;
		 }
		  Queue<NodeT> que= new LinkedList<NodeT>();
		  que.offer(root);
		 int max=root.data;
		  while(!que.isEmpty()){
			  NodeT node=que.poll();
			  if(max<node.data){
				  max=node.data;
			  }
			  
			  if(node.left!=null){
				  que.offer(node.left);
			  }
			  if(node.right!=null){
				  que.offer(node.right);
			  } 
		  }
		  System.out.println("Max Element in Binary Tree is : " + max);
		 return max;
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
			
			maxElement(A);
	}
}
