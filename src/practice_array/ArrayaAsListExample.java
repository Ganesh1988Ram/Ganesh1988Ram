package practice_array;


import java.util.Arrays;
import java.util.List;

public class ArrayaAsListExample {

    public static void main(String[] argv) throws Exception
    {

        try {

            // creating Arrays of Integer type
            Integer a[] = new Integer[] { 10, 20, 30, 40 };

            // getting the list view of Array
            List<Integer> list = Arrays.asList(a);

            // printing the list
            System.out.println("The list is: " + list);
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
