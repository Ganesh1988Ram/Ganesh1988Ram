package practice_array;

import java.util.List;

public class ReverseString {
	
	public static void main (String [] args)
	{
		String str ="GANESH";
		
		
		String str2= "RAMA";
		
		char[] ch = str.toCharArray();
		
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int n =str.length()-1;
		
		for(int i=n;i>=0;i--)
		{
		 sb1.append(ch[i]);
		}
		
		System.out.println(sb1);
		
		
		
		//reverse using only stringbuilder
		System.out.println(sb2.append(str2).reverse());
		
		
		
	}

}
