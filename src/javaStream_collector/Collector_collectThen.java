package javaStream_collector;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector_collectThen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	List<Integer> ul = Stream.of(12, 13, 14, 15)
			.collect(
			Collectors.collectingAndThen(
			    Collectors.toList(),
			    Collections::unmodifiableList
			)
			);

}
}


