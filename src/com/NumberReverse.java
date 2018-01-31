package com;

public class NumberReverse {
	
	public static int reverseNumber(int number){
		
		int reverNum=0;
		 while (number!=0) {
			 reverNum=(reverNum*10+number%10);
			 number=number/10;
		}
		return reverNum; 
	}
	public static void main(String a[]){
	
		System.out.println("resver number :"+reverseNumber(12345));
	}
}
