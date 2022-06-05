package practiceDataStru;

import java.util.LinkedList;

public class LinkedListDemo1 {
	 public static void main(String args[]) 
	    { 
	        LinkedList<String> ll = new LinkedList<>(); 
	    
	        ll.add("Ganesh"); 
	        ll.add("Ram"); 
	        
	    
	        System.out.println("Initial LinkedList " + ll); 
	        ll.add(0, "Appavu"); 
	        ll.set(2, "Pudukkottai"); 
	    
	        System.out.println("Updated LinkedList " + ll); 
	        ll.remove("Pudukkottai");
	       System.out.println("Updated after rmoved LinkedList " + ll); 
	    } 
	} 