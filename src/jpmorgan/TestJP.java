package jpmorgan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestJP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList(); 
		
		ls.add("morgan");
		ls.add("Ganesh");
		ls.add("Ram");
		ls.add("ganesh");
		ls.add("Ram");
		
		System.out.println(removeDublicate(ls));
	}
	
	
	public static List<String> removeDublicate(List<String> args)
	
	{
		
		//streams 
		
	 List<String> result= args.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
		return result;
		
	}

}
