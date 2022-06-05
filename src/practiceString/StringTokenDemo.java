package practiceString;

import java.util.StringTokenizer;

public class StringTokenDemo {
	
	   public static void main(String[] args) {  
	       StringTokenizer st = new StringTokenizer("my,name,is,khan");  
	        
	      // printing next token  
	      System.out.println("Next token is : " + st.nextToken(","));  
	      String newString=st.nextToken(",");  
	      System.out.println("Next token is : " + newString);  
	   }      

}
