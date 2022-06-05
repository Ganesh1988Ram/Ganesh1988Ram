package defaultStaticInterface;

public class DefaultClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TestClass d = new TestClass();
	        d.square(4);
	  
	        // default method executed
	        d.show();
	        TestInt2.show();
	}
	
	

}

class TestClass implements TestInt1
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
}