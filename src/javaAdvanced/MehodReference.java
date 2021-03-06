package javaAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

import java.util.ArrayList;

public class MehodReference {
	
	public static void main(String [] args)
	{
		
		
		//Method reference to static method ? Class::staticMethodName
		//An example to use Math.max() which is static method.

		List<Integer> integers = Arrays.asList(1,12,433,5);
		     
		Optional<Integer> maxi = integers.stream().reduce( Math::max ); 
		 
		maxi.ifPresent(value -> System.out.println(value)); 
		
		//------------------------------------------------------------//
		
	//	Method reference to instance method from instance ? ClassInstance::instanceMethodName
	//	In above example, we use System.out.println(value) to print the max value found. We can use System.out::println to print the value.

		List<Integer> integer = Arrays.asList(1,12,433,5);
		     
		Optional<Integer> ma = integer.stream().reduce( Math::max ); 
		 
		ma.ifPresent( System.out::println ); //this one
		
	
		
		//===============================================================//
		
		//Method reference to instance method from class type ? Class::instanceMethodName
		//In this example, s1.compareTo(s2) is referred as String::compareTo.

		List<String> strings = Arrays
		    .asList("how", "to", "do", "in", "java", "dot", "com");
		 
		List<String> sorted = strings
		    .stream()
		    .sorted((s1, s2) -> s1.compareTo(s2))
		    .collect(Collectors.toList());
		 
		System.out.println(sorted);
		 
		List<String> sortedAlt = strings
		    .stream()
		    .sorted(String::compareTo)  //here
		    .collect(Collectors.toList());
		 
		System.out.println(sortedAlt);
		
		//============================================================================//
		
		//Reference to constructor ? Class::new
		//The first method can be updated to create a list of integers from 1 to 100. Using lambda expression is rather easy. To create a new instance of ArrayList, we have use ArrayList::new.

		List<Integer> integers2 = IntStream
		        .range(1, 100)
		        .boxed()
		        .collect(Collectors.toCollection( ArrayList::new ));
		 
		Optional<Integer> max3 = integers2.stream().reduce(Math::max); 
		 
		max3.ifPresent(System.out::println); 
	}

}
