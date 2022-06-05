package practiceDataStru;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	 // Instantiate an object of HashSet
	public static void main(String[] args)
    {
    HashSet<String> hs = new HashSet<String>();

    hs.add("D");
    hs.add("B");
    hs.add("C");
    hs.add("A");
    hs.add("F");
    hs.add("E");

    // Iterating though the HashSet
    Iterator itr = hs.iterator();
    while (itr.hasNext())
        System.out.print(itr.next() + ", ");
    System.out.println();
    hs.remove("F");
    // Using enhanced for loop
    for (String s : hs)
    {
        System.out.print("HashMap-testing"+s + ", ");
    System.out.println();
    }
    //************************Linkedhashmap example**************************
    
    LinkedHashSet<String> lhs
    = new LinkedHashSet<String>();

// Elements are added using add() method
         lhs.add("Geek");
         lhs.add("For");
         lhs.add("Geeks");
         lhs.add("A");
         lhs.add("B");
         lhs.add("Z");

// print elements to the console
        System.out.println("Initial linked HashSet " + lhs);

// Removing the element b
        lhs.remove("B");

        System.out.println("After removing element " + lhs);

// Returns false if the element is not present
        System.out.println(hs.remove("AC"));
        
 //***************************TREE set example***********************************
        Set<String> ts = new TreeSet<>();
        
        // Elements are added using add() method
        ts.add("C");
        ts.add("A");
        ts.add("B");
 
        System.out.println(ts);
  //*************************NavigableSet**************************************
        
        NavigableSet<String> nts = new TreeSet<>();
        
        // Elements are added using add() method
        nts.add("A");
        nts.add("B");
        nts.add("C");
        nts.add("D");
 
        System.out.println("Tree Set is " + nts);
 
        String check = "Geeks";
 
        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check + " "
                           + nts.contains(check));
 
        // Print the first element in
        // the TreeSet
        System.out.println("First Value " + nts.first());
 
        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + nts.last());
 
        String val = "C";
 
        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + nts.higher(val));
        System.out.println("Lower " + nts.lower(val));
}

}