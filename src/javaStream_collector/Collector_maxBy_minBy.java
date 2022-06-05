package javaStream_collector;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Collector_maxBy_minBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2,3,5,6,7,8);
		
		//MaxBy
		Optional<Integer> result = list.stream()
				  .collect(Collectors.maxBy(Comparator.naturalOrder()));
		
		System.out.println(result);
		
		 if (result.isPresent()) {
	            System.out.println(result.get());
	        }
		
		//MinBy
		
		Optional<Integer> resultMin = list.stream()
				  .collect(Collectors.minBy(Comparator.naturalOrder()));
		
		System.out.println(resultMin);

	}

}
