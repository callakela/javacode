package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;


public class Test {
	
	public static void main(String[] args){
		//System.out.println(rerevreStentance("My name is Amit"));
		//checkIfDuplicateChars("amitakelaall");
		//System.out.println(getFisrtNonRepeatingChar("amitakelaall"));
		/*int[] data = { 1, 2, 3, 4, 5 };
		Node head = new Node(data[0]);
		for (int count = 1; count < data.length; count++)
			ReverseList.insertIntoList(head, data[count]);
		System.out.println("Single linked list before reversal:");
		ReverseList.printList(head);
		System.out.println("head.data>>"+head.data);
		 ReverseList.printReverseLinkedList(head);
		System.out.println("Single linked list after reversal:");
		ReverseList.printList(head);*/
		/*LongPredicate predicate1 = (x) -> (x > 0);
	    LongPredicate predicate2 = (y) -> (y == 5);

	    // Using and() method
	    boolean value = predicate1.and(predicate2).test(10);
	    System.out.println(value);
	    
	    //Using or() method 
	    value=predicate1.or(predicate2).test(10);
	    System.out.println(value);
	    
	    //Using negate() method
	    value=predicate1.negate().test(10);
	    System.out.println(value);
	    
	    Stream<Integer> stream = Stream.of(1,2,4,5,3,6,7,8,9,10);*/
		 Person person1 = new Person("Mike", Arrays.asList("Java", "Scala"));
	      Person person2 = new Person("Devid", Arrays.asList("Php", "JavaScript"));
	      Person person3 = new Person("Mohit", Arrays.asList("C++", "C#"));
	      List<Person> persons = Arrays.asList(person1, person2, person3);
	      System.out.println("--------Using map() method to print name of all person---------");
	      persons.stream().map(p->p.getLanguages()).flatMap(l -> l.stream()).forEach(System.out::println);
	      
	      Consumer<String> consumerStr=s->{
				System.out.println(s+ "Java");
			};
			Consumer<String> consumerInt=i->{
				System.out.println(i+ "EveryOne");
			};
			
			consumerStr.andThen(consumerInt).accept("Hello");
	}
	
	
	static String rerevreStentance(String str){
		
		
		StringBuffer sb = new StringBuffer();
				
		String[] words = str.split(" ");
		for(int i = words.length-1; i >= 0; i--)
		{
		   System.out.print(words[i] + " ");
		   sb.append(words[i]+" ");
		}
		System.out.println("--"+sb.toString());
		return  sb.toString().trim();
	}
	
	static boolean checkIfDuplicateChars( String str){
		
		Map<Character,AtomicInteger> map=getCount(str);
		Map<Character,AtomicInteger> duplicatemap=new HashMap();
		
		for (Entry<Character, AtomicInteger> val : map.entrySet()) {
			
			if(map.get(val.getKey()).intValue()>1){
				duplicatemap.put(val.getKey(), val.getValue());
			}
		}
		System.out.println("duplicatemap=>>>"+duplicatemap);
		return true;
	}
	
	static Map<Character,AtomicInteger> getCount(String value){
		
		 Map<Character,AtomicInteger> map =new HashMap<>();
		 if(null!=value){
			 
		   for (int i = 0; i < value.length(); i++) {
			    char ch=value.charAt(i);
			   if(map.containsKey(ch)){
				   map.get(ch).getAndIncrement();
			   }else{
				   map.put(ch, new AtomicInteger(1));
			   }
			
		   }
		 }
		 System.out.println("Count of each char string [" + value + "] is " + map);
		 return map;
	}
	
	public static Character getFisrtNonRepeatingChar(String inputStr){
		 Set<Character> rep = new LinkedHashSet<Character>();
		 List<Character> nonRep=new ArrayList<Character>();
		for (int i = 0; i < inputStr.length(); i++) {
			  char charseq=inputStr.charAt(i);
			  if(rep.contains(charseq)){
				 continue; 
			  }
			  
			  if(nonRep.contains(charseq)){
				  nonRep.remove((Character)charseq);
				  rep.add(charseq);
			  }else{
				  nonRep.add(charseq);
			  }
			 
			
		}
		
	
	
	  return nonRep.get(0);
	}
}
