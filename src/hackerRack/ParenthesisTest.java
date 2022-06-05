package hackerRack;

import java.util.Stack;

public class ParenthesisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "{}(){]";
		 Stack<String> paren = new Stack<String>();
		    for (String p : str.split("")) {
		        if (paren.isEmpty()) {
		            paren.push(p);
		        } else {
		            String top = paren.peek();
		            if(p.equals("}") && top.equals("{")
		            ||(p.equals("]") && top.equals("[")
		            ||(p.equals(")") && top.equals("(")))) {
		                paren.pop();
		            } else {
		                paren.push(p);
		            }
		        }
		    }
		    if(paren.size()<=1){
		        System.out.println("true");
		    } else {
		        System.out.println("false");
		    }
		
	}

}
