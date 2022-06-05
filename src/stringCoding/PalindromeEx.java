package stringCoding;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String str =sc.nextLine();
 System.out.println(checkPolin(str));
  
  
  
  
  
  
	}
	
	
	static boolean checkPolin(String st)
	{
		
		char[] ch = st.toCharArray();
         int j=ch.length-1;
		
		for(int i=0;i<ch.length;i++)
			
		{
			if(st.charAt(i)==st.charAt(j))
			{
				j--;
			}else
			{
				return false;
			}
		}
		
		
		
		
		
		return true;
	}

}
