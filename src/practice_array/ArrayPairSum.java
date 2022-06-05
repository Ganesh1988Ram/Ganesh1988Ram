package practice_array;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSum {

    public static void main(String[] args)
    {
        int [] a= {2,43,2,21,43,45,32,54,46,33,67,99,1,98};
        printSumPairs(a,100);


    }

    public static void printSumPairs(int [] input, int k)
    {
        Map<Integer,Integer> pairs = new HashMap<Integer,Integer>();

        for (int i=0; i<input.length; i++)
        {
            if(pairs.containsKey(input[i]))
            {
                System.out.println(input[i] +","+pairs.get(input[i]));
            }else {
                pairs.put(k-input[i],input[i]);
            }
        }
    }
}
