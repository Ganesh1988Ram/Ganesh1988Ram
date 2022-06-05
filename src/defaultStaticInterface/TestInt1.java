package defaultStaticInterface;

public interface TestInt1 {
	
	
	// abstract method
    public void square(int a);
    
    
	 default void show()
	  {
	  System.out.println("Default TestInterface1");
	  }
}
