package practiceDataStru;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SynchronisedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { 

			// creating object of List<String> 
			List<Integer> list = new ArrayList<Integer>(); 

			// populate the list 
			list.add(10); 
			list.add(20); 
			list.add(30); 
			list.add(40); 
			list.add(50); 

			// printing the Collection 
			System.out.println("Collection : " + list); 

			// getting the syncronised view of Collection 
			Collection<Integer> c = Collections.synchronizedCollection(list); 

			// printing the Collection 
			System.out.println("Synchronized view is: " + c); 

		} catch (IllegalArgumentException e) { 
			System.out.println("Exception thrown: " + e); 
		} 
	}

}
