package interfacedefaultoverride;

public class DefaultMethodOverrideImpl implements DefaultExInterface {
	
	  public void display() {
	      System.out.println("display method of class");
	   }
	   public static void main(String args[]) {
		   DefaultMethodOverrideImpl obj = new DefaultMethodOverrideImpl();
	      obj.display();
	   }

}
