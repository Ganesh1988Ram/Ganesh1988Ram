package interfacedefaultoverride;

public interface DefaultExInterface {
	
	 public static int num = 100;
	 public default void display() {
	      System.out.println("display method of MyInterface");
	   }

}
