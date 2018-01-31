package com;

public class NodeT {
	
	int data;
	NodeT left;
	NodeT right;
	
	public NodeT(int val){
		data=val;
		left=null;
		right=null;
	}
	public NodeT(){
		left=null;
		right=null;
	}
	
	public static NodeT creatNode(int num){
		NodeT node=new NodeT(num);
		return node;
	}

}
