package practice_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

    // Generic function to convert array to list
    public static <T> List<T> convertArrayToList(T array[])
    {
        // create a list from the Array
        return Arrays
                .stream(array)
                .collect(Collectors.toList());
    }

    public static void main(String args[])
    {
        // Create an Array
        String array[] = { "Geeks", "forGeeks",
                "A computer Portal" };
        
        // Print the Array
        System.out.println("Array: "
                + Arrays.toString(array));

        // convert the Array to List
        List<String>
                list = convertArrayToList(array);
        
        List<String> listB= Arrays.asList(array);
        
        

        // Print the List
        System.out.println("List: " + list);
        
        System.out.println("ListB: " + listB);
    }
}
