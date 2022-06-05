package javaStreamex1;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamExample3_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      // Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                                          "1", "2.3");
  
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(num -> Stream.of(num)).
                         forEach(System.out::println);
        
        
        List<String> list2 = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");
   // List of strings ----------------------------------------start-------------List of Stings-------------
// Using Stream flatMap(Function mapper)
            list2.stream().flatMap(str -> 
              Stream.of(str.charAt(2))).
                 forEach(System.out::println);
// List of strings ----------------------------------------end-------------List of Stings-------------
            
// combinining three list================================================================combine
            List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
            
            // Creating a list of Odd Numbers
            List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
              
            // Creating a list of Even Numbers
            List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
      
            List<List<Integer>> listOfListofInts =
                    Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
      
            System.out.println("The Structure before flattening is : " +
                                                      listOfListofInts);
              
            // Using flatMap for transformating and flattening.
            List<Integer> listofInts  = listOfListofInts.stream()
                                        .flatMap(list3 -> list3.stream())
                                        .collect(Collectors.toList());
      
            System.out.println("The Structure after flattening is : " +
                                                             listofInts);
            
            
    }
	
	

	
	
	

}
