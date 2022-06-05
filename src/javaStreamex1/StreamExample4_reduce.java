package javaStreamex1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamExample4_reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//reduce used for multiple chain of strings finging longest digit-------------------
	
        List<String> words = Arrays.asList("A", "AAAAA", "B",
                                           "CCCC", "DDDD");
  
        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                                   .reduce((word1, word2)
                             -> word1.length() > word2.length()
                                           ? word1 : word2);
  
        // Displaying the longest String
        longestString.ifPresent(System.out::println);
        
      //reduce used for multiple chain of strings finging longest digit-------------------
    
        
        //combining string ---------------------------reduce------------
        
        // String array
        String[] array = { "Geeks", "for", "Geeks" };
  
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> String_combine = Arrays.stream(array)
                                           .reduce((str1, str2)
                                           -> str1 + "-" + str2);
  
        // Displaying the combined String
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
            
          //combining string ---------------------reduce----------------
            
          //multiply one and next element
            
            int product = IntStream.range(2, 8)
                    .reduce((num1, num2) -> num1 * num2)
                    .orElse(-1);
 
       // Displaying the product
              System.out.println("The product is : " + product);
        }
        
        
        
	}

}
