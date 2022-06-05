package arrayNew;

import java.util.Arrays;

public class KthElement {


    public static int kthelement(Integer[] arr, int k)
    {

        Arrays.sort(arr);

        return arr[k-1];

    }

    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] {12,3,4,5,33,32,42,43,43,43,43,65};
        int k=6;
        System.out.println("Kth element-"+kthelement(arr,k));

    }
}
