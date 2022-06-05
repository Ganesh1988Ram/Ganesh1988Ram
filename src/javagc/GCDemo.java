package javagc;

public class GCDemo {

	public static void main(String[] args) {
		
		GCDemo gcdemo = new GCDemo();
		gcdemo=null;
		
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Main method is done");
		
		// TODO Auto-generated method stub

	}
	
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Finalize method called");
	}

}
