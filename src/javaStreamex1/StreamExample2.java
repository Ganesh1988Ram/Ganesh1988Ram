package javaStreamex1;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample2 {
	
	 //Upper Case ----------------------------------------------------------Upper Case
    public static void main(String[] args)
    {
  
        System.out.println("The stream after applying "
                           + "the function is : ");
  
        // Creating a list of Integers
        List<String> list = Arrays.asList("geeks", "gfg", "g",
                                          "e", "e", "k", "s");
  
        // Using Stream map(Function mapper) to
        // convert the Strings in stream to
        // UpperCase form
        List<String> answer = list.stream().map(String::toUpperCase).
        collect(Collectors.toList());
  
        // displaying the new stream of UpperCase Strings
        System.out.println(answer);
        
        
     //   ====================================*3======================================
        		
        // Creating a list of Integers
        List<Integer> list2 = Arrays.asList(3, 6, 9, 12, 15);
  
        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list2.stream().map(number -> number * 3).forEach(System.out::print);	
        
       //===========================String to Integer==========================
        
        // Creating a list of Strings
        List<String> list3 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                                          "Computer", "Science", "gfg");
  
        // Using Stream map(Function mapper) and
        // displaying the length of each String
        list3.stream().map(str -> str.length()).forEach(System.out::println);
        
    }

}
