package practiceException;

import java.io.IOException;

class ThrowsException1 {
	void method()throws IOException{  
		  System.out.println("device operation performed");  
		 }  
		}  
		class Testthrows3{  
		   public static void main(String args[])throws IOException{//declare exception  
			   ThrowsException1 m=new ThrowsException1();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		  }  
}