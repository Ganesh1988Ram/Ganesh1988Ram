package trickyQuestions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeObj implements Serializable {
	
	
	private String name;
	SerializeObj(String name)
    {
        // This keyword refers to current object itself
        this.name = name;
    }
	
	/**
	 * Method 4: Using deserialization
       Whenever we serialize and then deserialize an object, JVM creates a separate object. In deserialization,
        JVM doesn’t use any constructor to create the object.
         To deserialize an object we need to implement the Serializable interface in the class.
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		SerializeObj objS= new SerializeObj("GaneshRam");
		
		FileOutputStream fos = new FileOutputStream("C:/Users/tokyo/OneDrive/Desktop/java_interview/file.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(objS);
		os.close();
		fos.close();
		
	}


}
