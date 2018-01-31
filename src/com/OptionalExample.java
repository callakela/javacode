package com;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		
		Optional<String> string = Optional.empty();
	      Optional<Double> decimal = Optional.empty();
	      Optional<String> string2 = Optional.of("Optinal class example");
	      Optional<Double> decimal2 = Optional.of(45.51);

	      // Creating nullable Optional object
	      Optional<String> string3 = Optional.ofNullable(null);
	      Optional<Double> decimal3 = Optional.ofNullable(null);
	      
	      if(string.isPresent()){
	          System.out.println(string.get());
	       }
	      if(decimal.isPresent()){
	          System.out.println(decimal.get());
	       }
	      if(string2.isPresent()){
	          System.out.println(string2.get());
	       }
	      if(decimal2.isPresent()){
	          System.out.println(decimal2.get());
	       }
	      if(string3.isPresent()){
	          System.out.println(string3.get());
	       }
	      if(decimal3.isPresent()){
	          System.out.println(decimal3.get());
	       }
	      string.ifPresent(System.out::println);
	      string2.ifPresent(System.out::println);
	      decimal2.ifPresent(System.out::println);
	      Optional<String> optional1 = Optional.empty();
	      Optional<String> optional2 = Optional.of("Java Optional example");
	      
	      // Using orElse() method
	      String str1 = optional1.orElse("orElse example");
	      System.out.println(str1);

	      String str2 = optional2.orElse("Optional orElse example");
	      System.out.println(str2);

	      // Using orElseGet() method
	      String str3 = optional1.orElseGet(() -> "orElseGet example");
	      System.out.println(str3);
	      
	      String str4 = optional2.orElseGet(() -> "Optional orElseGet example");
	      System.out.println(str4);
	      
	      //Using orElseThrow() method
	      try {
	         String str5 = optional1.orElseThrow(()->new Exception("Value is not present in Optional"));
	         System.out.println(str5);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      try {
	         String str6 = optional2.orElseThrow(()->new Exception("Value is not present in Optional"));
	         System.out.println(str6);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      Optional<String> optional = Optional.of("Java Optional example");
	      Optional<String> optional11 = optional.filter(s -> s.contains("Optional"));
	      optional11.ifPresent(System.out::println);

	      // Using map() method
	      Optional<String> optional21 = optional.map(String::toUpperCase);
	      optional21.ifPresent(System.out::println);

	      // Using flatMap() method
	      Optional<String> optional3 = optional.flatMap(s -> Optional.of(s + " - flatMap() method"));
	      optional3.ifPresent(System.out::println);
	      
	}
}
