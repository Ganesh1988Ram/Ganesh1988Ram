package practice_array;

import java.util.Scanner;

public class FibonaciSerious {
	
	public static void main(String [] args)
	
	{
		Scanner sc = new Scanner(System.in);
		int abc=sc.nextInt();
		int a=0,b=0,c=1;
		for(int i =0;i<=abc;i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a);
		}
			
	}

}
