package javaStream_collector;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector_CharactorJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   List<Character> list = Arrays.asList('D', 'e', 'm', 'o');
		      String str = list.stream().map(String::valueOf).collect(Collectors.joining());
		      
		      System.out.println(str);
		      
		      
		      // add coma in the words
		      
		      String chString = list.stream()
                      .map(String::valueOf)
                      .collect(Collectors.joining(", "));
                       System.out.println(chString);
                       
                       
             // add prefix and suffix
                       
                       
                       String prefixSuffix = list.stream()
                               .map(String::valueOf)
                               .collect(Collectors.joining(", ", "[", "]"));
                       System.out.println(prefixSuffix);
	}

	
	
}

/**

public class Demo {
   public static void main(String[] args) {
      List<Character> list = Arrays.asList('D', 'e', 'm', 'o');
      String str = list.stream().map(String::valueOf).collect(Collectors.joining());
      System.out.println("Concatenated = "+str);
   }
}


*/