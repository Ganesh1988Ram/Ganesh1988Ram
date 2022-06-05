package defaultStaticInterface;

public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestClass2 d = new TestClass2();
	        d.square(4);
	  
	        // Static method executed
	        TestInt2.show();
	}

}


class TestClass2 implements TestInt2
{
    // Implementation of square abstract method
    public void square (int a)
    {
        System.out.println(a*a);
    }
    
}