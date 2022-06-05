package javagc;

public class GCDemo3 {
	
	//island of isolation
	
	GCDemo3 gcdemo3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GCDemo3 gcdemo1 = new GCDemo3();
		GCDemo3 gcdemo2 = new GCDemo3();
	
		
		
		gcdemo1.gcdemo3=gcdemo2;
		gcdemo2.gcdemo3=gcdemo1;
		
		gcdemo1=null;
		gcdemo2=null;
		
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
