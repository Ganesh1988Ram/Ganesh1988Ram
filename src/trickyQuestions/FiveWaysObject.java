package trickyQuestions;

import java.lang.reflect.Constructor;

public class FiveWaysObject {

	/**
	 * There are five different ways to create an object in Java:
Java new Operator
Java Class.newInstance() method
Java newInstance() method of constructor
Java Object.clone() method
Java Object Serialization and Deserialization
	 */
	
	
	
	
	//creating object with newInstance
	
	public static void main(String [] args)
	{
		try {
			FiveWaysObject fw= FiveWaysObject.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//creating object with refelect constructor
		
		try {
			Constructor<FiveWaysObject> obj =FiveWaysObject.class.getConstructor();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		
		
	}
	
	//creating object with refelect constructor
	
	
	
	
}
