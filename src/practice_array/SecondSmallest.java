package practice_array;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args)
    {
        int [] arr = {2,3,4,5,6,7};
        Arrays.sort(arr);
        int b= arr.length;
        System.out.println(arr[b-2]);

    }


}
