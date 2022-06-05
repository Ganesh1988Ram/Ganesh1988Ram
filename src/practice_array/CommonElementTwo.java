package practice_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementTwo {

    public static void FindCommonElements(int[] arr1, int[] arr2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i :arr1){
            set1.add(i);
        }

        for(int i :arr2){
            set2.add(i);
        }

        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }

    // main method
    public static void main(String[] args)
    {
        // create Array 1
        int[] arr1
                = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

        // create Array 2
        int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 ,25};

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));
        FindCommonElements(arr1, arr2);
    }
}
