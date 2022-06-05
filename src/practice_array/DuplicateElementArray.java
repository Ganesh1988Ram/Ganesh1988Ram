package practice_array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementArray {

    public static void findDuplicate(int [] nums)
    {
        int l= nums.length;

        Set<Integer> val = new HashSet<>();
        List<Integer> x = new ArrayList<>();
        for(int i=0; i<l; i++)
        {
            if(val.add(nums[i])==false)
            {
                x.add(nums[i]);
            }
        }

        System.out.println(x);
    }

    public static void main(String [] args)
    {
        findDuplicate(new int[]{2, 4, 5, 6, 6, 7, 8, 8, 9});
    }
}
