package practiceDataStru;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorVsListIterator {
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(); 

		list.add(10); 
		list.add(20); 
		list.add(30); 
		list.add(40); 
		list.add(50); 

		// Iterator 
		Iterator itr = list.iterator(); 
		System.out.println("Iterator:"); 
		System.out.println("Forward traversal: "); 

		while (itr.hasNext()) 
			System.out.print(itr.next() + " "); 

		// ListIterator 
		ListIterator i = list.listIterator(); 
		System.out.println("\nListIterator:"); 
		System.out.println("Forward Traversal : "); 

		while (i.hasNext()) 
			System.out.print(i.next() + " "); 

		System.out.println("\nBackward Traversal : "); 

		while (i.hasPrevious()) 
			System.out.print(i.previous() + " "); 
	} 

}
