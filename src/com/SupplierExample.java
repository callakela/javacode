package com;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String arg[]){
		
		Supplier<String> supl1=()->{return "Hello world.";};
		System.out.println("supl1 "+supl1.get());
		Consumer<String> consumerSt=(s)->{System.out.println("---"+s);};
		
		consumerSt.accept("Hi I amit ");
		Consumer<String> consumer1=s->{
			System.out.println(s+" World.");
		};
		Consumer<String> consumer2=s->{
			System.out.println(s+" Java.");
		};
		consumer1.andThen(consumer2).accept(" Amit ");
		
	}

}
