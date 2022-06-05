package practiceDataStru;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast_Safe {
	//**************************************************Fail Fast*********************************************
	  public static void main(String[] args) {

	        //Creating an ArrayList of integers
	        ArrayList<Integer> list = new ArrayList<Integer>();
	         
	        //Adding elements to list
	        list.add(1452);
	        list.add(6854);
	        list.add(8741);
	                 
	        //Getting an Iterator from list
	        Iterator<Integer> it = list.iterator();
	        System.out.println("fail fast");
	        while (it.hasNext()) {
	            Integer integer = (Integer) it.next();
	           // list.add(8457);      //This will throw ConcurrentModificationException
	        }
	       
	        System.out.println("fail fase");
	  //*********************************************Fail Safe*********************************************
	  
      ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
      
      //Adding elements to map
      map.put("ONE", 1);
      map.put("TWO", 2);
      map.put("THREE", 3);
      System.out.println("fail safe");
      //Getting an Iterator from map
      Iterator<String> itsafe = map.keySet().iterator();
       
      while (itsafe.hasNext()) {
          String key = (String) itsafe.next();
          System.out.println("fail safe"+key+" : "+map.get(key));
          map.put("FOUR", 4); //This will not be reflected in the Iterator
          System.out.println("fail safe"+key+" : "+map.get(key));
      }
      while (itsafe.hasNext()) {
          String key = (String) itsafe.next();
          System.out.println("fail safe after add 4"+key+" : "+map.get(key));
         
      }
      
      Iterator<String> itsafeb = map.keySet().iterator();
      
      while (itsafeb.hasNext()) {
          String key = (String) itsafeb.next();
          System.out.println("fail safe after add 4 new"+key+" : "+map.get(key));
         
      }

}
}



/*
 * 
Concurrent Modification: Concurrent Modification in programming means to modify an object concurrently when another task is already running over it. For example, in Java to modify a collection when another thread is iterating over it. Some Iterator implementations (including those of all the general purpose collection implementations provided by the JRE) may choose to throw ConcurrentModificationException if this behavior is detected.
 

Fail Fast And Fail Safe Iterators in Java

Iterators in java are used to iterate over the Collection objects.Fail-Fast iterators immediately throw ConcurrentModificationException if there is structural modification of the collection. Structural modification means adding, removing any element from collection while a thread is iterating over that collection. Iterator on ArrayList, HashMap classes are some examples of fail-fast Iterator.
Fail-Safe iterators don’t throw any exceptions if a collection is structurally modified while iterating over it. This is because, they operate on the clone of the collection, not on the original collection and that’s why they are called fail-safe iterators. Iterator on CopyOnWriteArrayList, ConcurrentHashMap classes are examples of fail-safe Iterator.
 

How Fail Fast Iterator works ?

To know whether the collection is structurally modified or not, fail-fast iterators use an internal flag called modCount which is updated each time a collection is modified.Fail-fast iterators checks the modCount flag whenever it gets the next value (i.e. using next() method), and if it finds that the modCount has been modified after this iterator has been created, it throws ConcurrentModificationException.
  
  
 
 */
