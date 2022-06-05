package practice_array;

public class InsertDash {
	
	public static void main(String [] args)
	{
		
	}
	
	static class insert {
		
		static boolean checkOdd(char ch)
		{
		    return ((ch - '0') & 1) != 0 ?
		            true : false;
		}
		
		
		static String Insert_dash(String num_str)
		{
		    StringBuilder result_str = new StringBuilder(num_str);
		 
		    // Traverse the string character
		    // by character
		    for(int x = 0; x < num_str.length() - 1; x++)
		    {
		 
		        // Compare every consecutive
		        // character with the odd value
		        if (checkOdd(num_str.charAt(x)) &&
		            checkOdd(num_str.charAt(x + 1)))
		        {
		            result_str.insert(x + 1, "-");
		            num_str = result_str.toString();
		            x++;
		        }
		    }
		 
		    // Print the resultant string
		    return result_str.toString();
		}
		
	}

	
	
}
