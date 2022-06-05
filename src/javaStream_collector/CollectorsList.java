package javaStream_collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");
		
	
		
		List<String> result1 = givenList.stream().collect(Collectors.toList());
		
		List<String> result2 = givenList.stream().collect(Collectors.toUnmodifiableList());
		
		
		Optional<String> result3 = givenList.stream().findAny();
		//result2.add("adding new element");
		
		IntStream.range(0, 16).max().stream().distinct().forEach(x->System.out.println(x));
		
		IntStream.range(0, 16).distinct().forEach(x->System.out.println(x));
		
		
		

		




}

//ArrayList to LinkedList conversion
	public static List<String> getInstance1(List<Integer> ArrayList)
	{
	    return ArrayList.stream()
	            .map(String::valueOf)
	            .collect(Collectors.toCollection(LinkedList::new));
	}

public static List<String> getInstance2(List<Integer> ArrayList)
{
    List<String> linkedList = new LinkedList<>();
    ArrayList.stream()
            .map(String::valueOf)
            .forEach(linkedList::add);
 
    return linkedList;
}
}