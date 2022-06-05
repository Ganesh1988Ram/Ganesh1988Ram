package dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class RemovingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Initializing an deque
        Deque<String> dq
            = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("Ganesh");
        dq.addFirst("Appavu");
        dq.addLast("Ram");
  
        System.out.println(dq);
  
      //  System.out.println(dq.pop());
  
       // System.out.println(dq.poll());
  
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println("After peek- results "+ " "+dq);
        
       //removing elements 
        System.out.println(dq.pollFirst());
  
        System.out.println(dq.pollLast());
        
        System.out.println(dq);
        
        dq.offerFirst("Appavu");
        dq.offer("Ram");
        
        
        //iterate
        

        for (Iterator itr = dq.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println();
  
        for (Iterator itr = dq.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
	}

}
