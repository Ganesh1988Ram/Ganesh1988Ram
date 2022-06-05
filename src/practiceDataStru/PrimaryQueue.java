package practiceDataStru;

import java.util.PriorityQueue;

public class PrimaryQueue {

    public static void main (String [] args)
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Ram");
        queue.add("Appavu");
        queue.add("Ganesh");

        for (int i=0;i<queue.size();i++)
        {
            System.out.println(queue);
            //System.out.println(queue.poll());
        }
       Object [] arr = queue.toArray();

        System.out.println("The array is ");
        for (int j=0;j<arr.length; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
