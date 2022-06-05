package javaStreamex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Person("Ganesh",10,Gender.MALE);
		Person obj2=new Person("Rmf",30,Gender.FEMALE);
		Person obj3=new Person("Rama",40,Gender.FEMALE);
		Person obj4=new Person("Swetha",30,Gender.FEMALE);
		Person obj5=new Person("Raj",10,Gender.MALE);
		Person obj6=new Person("Raman",40,Gender.MALE);
		Person obj7=new Person("Kumar",10,Gender.MALE);
		Person obj8=new Person("Bala",10,Gender.MALE);
		Person obj9=new Person("Riswan",40,Gender.MALE);
		Person obj10=new Person("Man",50,Gender.MALE);
		
		List<Person> per = new ArrayList<>();
		per.add(obj1);per.add(obj2);per.add(obj3);per.add(obj4);per.add(obj5);per.add(obj6);per.add(obj7);per.add(obj8);per.add(obj9);per.add(obj10);

//Filtering and Map----------------------------------------------------------------------------------Filtering and Map
		List<String> namesOfPeopleBelow20=per.stream().filter(person -> person.getAge() < 20)  
	    // pipelining another computation
	    .map(Person::getName)  
	    // terminating a stream
	    .collect(Collectors.toList());
		
		namesOfPeopleBelow20.forEach(System.out::println);
		
		// count based filtering    
		List<Person> smallerListOfPeople = per.stream()
		    .skip(2)
		    .limit(4)
		    .collect(Collectors.toList());
		
		smallerListOfPeople.forEach(System.out::println);
//Filtering and Map----------------------------------------------------------------------------------Filtering and Map	
//Searching ===========================//Searching
		
		// searching for a element
		Optional<Person> any = per.stream()
		    .filter(person -> person.getAge() < 20)
		    .findAny();
		System.out.println(any.toString());
		// searching for existence
		boolean isAnyOneInGroupLessThan20Years = per.stream()
		    .anyMatch(person -> person.getAge() < 20);
		
		
//Searching ===========================//Searching
		
//Reordering----------------------------------------------Reordering
		
		List<Person> peopleSortedEldestToYoungest = per.stream()
			    .sorted(Comparator.comparing(Person::getAge).reversed())
			    .collect(Collectors.toList());
//Reordering----------------------------------------------Reordering	
		
//Summarizing===========================================================Summarizing
		
		// calculating sum using reduce terminal operator
				per.stream()
				    .mapToInt(Person::getAge)
				    .reduce(0, (total, currentValue) -> total + currentValue);
				// calculating sum using sum terminal operator
				per.stream()
				    .mapToInt(Person::getAge)
				    .sum();
				// calculating count using count terminal operator
				per.stream()
				    .mapToInt(Person::getAge)
				    .count();
				// calculating summary
				IntSummaryStatistics ageStatistics = per.stream()
				    .mapToInt(Person::getAge)
				    .summaryStatistics();
				ageStatistics.getAverage();
				ageStatistics.getCount();
				ageStatistics.getMax();
				ageStatistics.getMin();
				ageStatistics.getSum();		
		
//Summarizing===========================================================Summarizing
		
	}
	
	

}
