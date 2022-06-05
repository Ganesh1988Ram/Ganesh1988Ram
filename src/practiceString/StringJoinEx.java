package practiceString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String abc = "askjfbajhflasldfisaefh";
		
		abc.join(",", abc);
		
		System.out.println(abc);
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
	 	//java, python, nodejs, ruby
		String result = String.join(", ", list);
		System.out.println(result);
		
		
		
		List<String> list2 = Arrays.asList("java", "python", "nodejs", "ruby");

		//java | python | nodejs | ruby
		String result2 = list2.stream().map(x -> x).collect(Collectors.joining("--"));
		
		System.out.println(result2);
	}

}
