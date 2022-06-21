package java8_lowdenency;

import java.util.Map;
import java.util.StringTokenizer;

public class JP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				transform("TH=A:100|B:200;SG=A:100|B:100");
			}
			
			


public static Map<String, Map<String, String>> transform(String args) {
    System.out.println(args);
     StringBuilder db = new StringBuilder(args);
     
   String str2=  args.replaceAll("=",",");
   
   String str3=  str2.replaceAll(":", ",");
   String str4=  str3.replaceAll("|", "");
   String str5=  str4.replaceAll(";", ",");
   System.out.println(str5);
     String[] ls= args.split(":");
     StringTokenizer st = new StringTokenizer(":");
    
     System.out.println(ls.length);
     

     
	return null;
}
}