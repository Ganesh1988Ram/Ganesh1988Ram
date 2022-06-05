package javaAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> test = new ArrayList<>();
		test =IntStream.range(0, 10)
        .filter(i -> i%2!=0).boxed()
        .collect(Collectors.toList());
		
		for(int t:test)
		{
			System.out.println(t);
		}
		
		
	}

}


/**
IntStream stream = IntStream.range(100, 200);
 
// filter by number divisible by 5 and 7
System.out.println("numbers divisible by 5 and 7 are : ");
stream.filter(i -> (i % 5 == 0 && i % 7 == 0)).forEach(System.out::println);
 
IntStream stream2 = IntStream.range(100, 200);
 
List<Integer> primes = stream2.filter(IntStreamOf::checkPrime).boxed().collect(Collectors.toList());
 
System.out.println("Prime numbers (100, 200) are "+primes);


*/