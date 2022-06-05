package javaStream_collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collector_String_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		 List<String> str = Arrays.asList("Appavu", "Gansh", "Ram");
		  
	        // Convert the character list into String
	        // using Collectors.joining() method
	        String chString = str.stream()
	                              .map(String::valueOf)
	                              .collect(Collectors.joining());
	        System.out.println(chString);
	        
	        
	        //ading coma for string
	        
	        String coma = str.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
                 System.out.println(coma);
                 
            // add prefix and suffix
                 
                 // Convert the character list into String
                 // using Collectors.joining() method
                 String prefixSufiix = str.stream()
                                       .map(String::valueOf)
                                       .collect(Collectors.joining(", ", "{", "}"));
                 System.out.println(prefixSufiix);
	}

}
