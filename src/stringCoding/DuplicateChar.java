package stringCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "Ganeshahe";
         
         char [] ch = str.toCharArray();
         
         Set<Character> val = new HashSet<>();
          List<Character> lw = new ArrayList<Character>();
         
         for(int i=0;i<ch.length;i++)
         {
        	 if(val.contains(str.charAt(i))==true)
        	 {
        		 lw.add(str.charAt(i));
        	 }
        	 
        	 val.add(str.charAt(i));
         }
 		System.out.println(lw);
	}

}
