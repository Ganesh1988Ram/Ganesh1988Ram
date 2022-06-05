package practiceString;

public class StringSubString {
	public static void main(String[] args) {  
        String s1="APPAVU ganesh Ram";    
        String substr = s1.substring(0); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
        System.out.println(substr2);    
        System.out.println(s1.repeat(10)); 
        System.out.println(s1.charAt(0)); 
        System.out.println(s1.codePointAt(2)); 
        System.out.println(s1.contentEquals("R")); 
        System.out.println(s1.trim());
        System.out.println(s1.contains("R"));
        System.out.println(s1.compareToIgnoreCase("APPAVU Ganesh Ram"));
        /***
         * The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.

              Suppose s1 and s2 are two string variables. If:

                   s1 == s2 :0
                   s1 > s2   :positive value
                   s1 < s2   :negative value
         */
        String substr3 = s1.substring(5,15); // Returns Exception  
    }  

}
