package javaStreamex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import hackerRack.Employee;

public class StreamExample5_veryImp {

	public static void main(String[] args) {
	
		//min  - max - statistics ------------------example start
		
		List <Integer> list1 =IntStream.of(1,2,3,4,5).boxed().toList();
		
		List <Integer> list2 =Stream.of(1,2,3,4,5).toList();
		
		int min1=IntStream.of(1,2,3,4,5).min().getAsInt();
		
		IntStream.of(1,2,3,4,5).min().ifPresent(System.out::println);		
		list1.stream().forEach(System.out::println);
		list2.stream().forEach(System.out::println);
		
    	//summary statistics
		
		IntSummaryStatistics stat = IntStream.of(1,2,3,4,5,6,7,8).summaryStatistics();
		stat.getMax();
		stat.getAverage();
		
		//min  - max - statistics --------------- example end 
		List<Integer> list3=	IntStream.of(6,4,6,4,3,3,7,4,10,44,55,34).distinct().sorted().map(e->e*3).limit(3).boxed().collect(Collectors.toList());
		list3.stream().forEach(System.out::println);
	//	=================================================================================================================
			
		
		
		
		
		// employee with salary and dept name

		
		  ArrayList<Employee> list = new ArrayList<>();
		    list.add( new Employee(2, "Lokesh", "Gupta") );
		    list.add( new Employee(1, "Alex", "Gussin") );
		    list.add( new Employee(4, "Brian", "Suxena") );
		    list.add( new Employee(5, "Neon", "Piper") );
		    list.add( new Employee(3, "David", "Beckham") );
		    list.add( new Employee(7, "Alex", "Beckham") );
		    list.add( new Employee(6, "Brian", "Suxena") );
		    
		    List<String> listEmplyee = list.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).limit(3).map(Employee::getFirstName).collect(Collectors.toList());
		    		          
		    listEmplyee.stream().forEach(System.out::println);
		    		                                
		//==================================================================================================================================
		
	}

}
