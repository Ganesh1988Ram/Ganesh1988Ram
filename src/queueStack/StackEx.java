package queueStack;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack sk = new Stack<>();
		
		sk.push("Appavu");
		sk.push("Ram");
		sk.push("Vijay");
		
		
		System.out.println(sk.toString());
		
		System.out.println(sk.peek());
		
		System.out.println(sk.pop());
		//after peek and pop
		System.out.println(sk.toString());
		
		Iterator<String> ski = sk.iterator();
		
		while(ski.hasNext())
		{
			System.out.println(ski.next());
		}
	}

}
