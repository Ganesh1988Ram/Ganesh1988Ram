package stringCoding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ConverstBytetoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Path path =Paths.get("C:/Users/tokyo/OneDrive/Desktop/java_interview/bytea.png");
		//C:/Users/tokyo/OneDrive/Desktop/java_interview
		  if (Files.notExists(path)) {
	            throw new IllegalArgumentException("File is not exists!");
	        }
		try {
			System.out.println("file is found"+path);
			
			byte [] arr = Files.readAllBytes(path);
			
			String s = Base64.getEncoder().encodeToString(arr);
			System.out.println(s.toString());
			
			 byte[] decode = Base64.getDecoder().decode(s);
               Files.write(Paths.get("C:/Users/tokyo/OneDrive/Desktop/java_interview/byteb.png"), decode);
			
		}catch(IOException ex)
		{
			  ex.printStackTrace();
		}
		
		
	
	}

}
