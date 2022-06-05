package trickyQuestions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		
		
		DeserializeEx d;
		 
         // Creating FileInputStream class object
         FileInputStream f
             = new FileInputStream("C:/Users/tokyo/OneDrive/Desktop/java_interview/file.txt");

         // Creating ObjectInputStream class object
         ObjectInputStream oos
             = new ObjectInputStream(f);
         d = (DeserializeEx)oos.readObject();
	}

}
