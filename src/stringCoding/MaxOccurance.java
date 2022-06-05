package stringCoding;

public class MaxOccurance
{
	//static final int N = 256;
static char MaxOccuringChar(String str1) {
	  int ctr[] = new int[256];
	  int l = str1.length();
	  
	  
	  for (int i = 0; i < l; i++)
	  {
	   ctr[str1.charAt(i)]++;
	  System.out.println("The given string at first for loop: "+str1.charAt(i));
	  System.out.println("The given string at first for loop: "+ ctr[str1.charAt(i)]);
	  }
	  
	  int max = -1;
	  char result = ' ';

	  for (int i = 0; i < l; i++) {
	   if (max < ctr[str1.charAt(i)]) {
	    max = ctr[str1.charAt(i)];
	    result = str1.charAt(i);
	   }
	  }

	  return result;
	 }
	 public static void main(String[] args) {
	  String str1 = "abcdaad22222222222222222";
	  System.out.println("The given string is: " + str1);
	  System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
	 }
	}
