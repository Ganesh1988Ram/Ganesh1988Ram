package practiceException;

public class TryCatch {
	public static void main(String[] args) {  
        try  
        {  
            int arr[]= {1,3,5,7};  
        }  
            // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  

}
