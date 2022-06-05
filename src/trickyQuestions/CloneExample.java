package trickyQuestions;

public class CloneExample implements Cloneable {
	
	 @Override
	    protected Object clone()
	        throws CloneNotSupportedException
	    {
	        // Super() keyword refers to parent class
	        return super.clone();
	    }
	 String name = "GaneshRam";


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneExample obj1 = new CloneExample();
		 
        // Try block to check for exceptions
        try {
 
            // Using the clome() method
        	CloneExample obj2 = (CloneExample)obj1.clone();
 
            // Print and display the main class object
            // as created above
            System.out.println(obj2.name);
        }
        
        // Catch block to handle the exceptions
        catch (CloneNotSupportedException e) {
 
            // Display the exception
            // using printStackTrace() method
            e.printStackTrace();
        }
		
	}
	
	

}
