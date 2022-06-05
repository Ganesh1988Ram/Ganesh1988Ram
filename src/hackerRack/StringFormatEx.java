package hackerRack;

public class StringFormatEx {
	
	  public static void main(String args[])
	    {
	        // Custom input string to be formatted
	        String str1 = "GFG";
	        String str2 = "GeeksforGeeks";
	  
	        // %1$ represents first argument
	        // %2$ second argument
	        String str = String.format(
	            "My Company name"
	                + " is: %1$s, %1$s and %2$s",
	            str1, str2);
	        
	      //  System.out.printf("%-15s%03d%n", s1, x); 
	  
	        // Print and display the formatted string
	        System.out.println(str);
	    }

}
