package javaStream_collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collector_partitionBy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");
		
		Map<Boolean, List<String>> result = givenList.stream()
				  .collect(Collectors.partitioningBy(s -> s.length() > 2));
		
		System.out.println(result);
		
		  Map<Boolean, List<Long>> m = IntStream.range(1, 10)
                  .mapToObj(Long::new)
                  .collect(Collectors.partitioningBy(
                           i -> i % 2 == 0));
              System.out.println(m);

	}

}
