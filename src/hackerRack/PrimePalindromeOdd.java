package hackerRack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PrimePalindromeOdd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 MyMath ob = new MyMath();
		 Scanner sc = new Scanner(System.in);
		 // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//  System.out.println(br.readLine());
		//  int T = Integer.parseInt(br.readLine());
		  PerformOperation op;
		  boolean ret = false;
		  String ans = null;
		//  while (T--> 0) {
		 //  String s = br.readLine().trim();
		//   StringTokenizer st = new StringTokenizer(s);
		//   int ch = Integer.parseInt(st.nextToken());
		//   int num = Integer.parseInt(st.nextToken());
		   
		   int ch = sc.nextInt();
		   int num = sc.nextInt();
		   
		   System.out.println(ch+" "+num);
		   
		   if (ch == 1) {
		    op = ob.isOdd();
		    
		    ret = ob.checker(op, num);
		    ans = (ret) ? "ODD" : "EVEN";
		   } else if (ch == 2) {
		    op = ob.isPrime();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "PRIME" : "COMPOSITE";
		   } else if (ch == 3) {
		    op = ob.isPalindrome();
		    ret = ob.checker(op, num);
		    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

		   }
		   System.out.println(ans);
		//  }
	}

}

interface PerformOperation {
	 boolean check(int a);
	}



//==============================================
	class MyMath {
	 public static boolean checker(PerformOperation p, int num) {
	  return p.check(num);
	 }
	public static PerformOperation isOdd() {
	        return n -> (n & 1) == 1;
	    }
	
	 public static PerformOperation isPrime() {
	        return n -> {
	            if (n < 2) {
	                return false;
	            } else if (n == 2) {
	                return true;
	            } else if (n % 2 == 0) {
	                return false;
	            }
	            int sqrt = (int) Math.sqrt(n);
	            for (int i = 3; i <= sqrt; i += 2) {
	                if (n % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        };
	    }

	    public static PerformOperation isPalindrome() {
	        return n -> {
	            String original = Integer.toString(n);
	            String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
	            return original.equals(reversed);
	        };
	    }
	}
