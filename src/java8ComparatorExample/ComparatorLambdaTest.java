package java8ComparatorExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		
		//lambda start here
		
		//lambda here!
				listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
			
				//java 8 only, lambda also, to print the List
				listDevs.forEach((developer)->System.out.println(developer));
		
		//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		//sort by name	
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		//lambda
		listDevs.sort((Developer o1, Developer o2)->o1.getName().compareTo(o2.getName()));		
		
		//lambda
		listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));	
					
		//sort by salary
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});	
		
		
		//lambda
		listDevs.sort((Developer o1, Developer o2)->o1.getSalary().compareTo(o2.getSalary()));
		
		//lambda
		listDevs.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));
	
		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}

}

