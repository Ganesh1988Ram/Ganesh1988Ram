package dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializing an deque
        Deque<String> dq
            = new ArrayDeque<String>();
  
        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
  
        System.out.println(dq);

	}

}
