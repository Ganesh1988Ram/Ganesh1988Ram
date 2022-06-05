package javagc;

public class GCDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GCDemo2 gcdemo1 = new GCDemo2();
		GCDemo2 gcdemo2 = new GCDemo2();
	
		
		
		gcdemo1= gcdemo2;
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
