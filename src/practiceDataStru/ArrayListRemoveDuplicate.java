package practiceDataStru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayListRemoveDuplicate {
	public static void main(String[] args) {

        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
         
        System.out.println("ArrayList with duplicate elements: "+numbersList);
 
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList); 
        System.out.println("hashset without duplicate elements: "+hashSet);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        System.out.println("ArrayList without duplicate elements: "+listWithoutDuplicates);
    }

}
