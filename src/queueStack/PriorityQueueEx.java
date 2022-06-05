package queueStack;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		PriorityQueue<String> pq= new PriorityQueue<>();
		
		pq.add("Ganesh");
		pq.add("Ram");
		pq.add("Appavu");
	
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		//after peek and poll
		System.out.println(pq.toString());
	}

}
