package javaStream_collector;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Collector_GroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> countElement = Arrays.asList("abc","bca","abc","tvs","abc");
		
		Map<String, Long > result = countElement.stream().collect( Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
		
		System.out.println(result);
		
	    Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
        
    
	}

}
