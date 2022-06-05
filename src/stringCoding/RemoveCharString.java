package stringCoding;

public class RemoveCharString {
	
	public static void main(String [] args)
	{
		String a ="abcdea";
		
		
		a= a.replace("a", "");
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(a);
		
		sb.append(a);
		
		sb.replace(3, 4, "j");
		
		System.out.println(sb);
	}

}
