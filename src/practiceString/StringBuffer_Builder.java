package practiceString;

public class StringBuffer_Builder {
	
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		//*******************insert******************
		StringBuffer sbi=new StringBuffer("Hello ");  
		sbi.insert(1,"Java");//now original string is changed  
		System.out.println(sbi);//prints HJavaello  
		  
        //******************replace******************
	
	    StringBuffer sbr=new StringBuffer("Hello");  
	    sbr.replace(1,3,"Java");  
	    System.out.println(sbr);//prints HJavalo  
	    //********************delete****************
	    StringBuffer sbd=new StringBuffer("Hello");  
	    sbd.delete(1,3);  
	    System.out.println(sbd);//prints Hlo 
	    //*********************reverse*************
	    StringBuffer sbre=new StringBuffer("Hello");  
	    sbre.reverse();  
	    System.out.println(sbre);//prints olleH  
	    //********************Capacity************
	    StringBuffer sbc=new StringBuffer();  
	    System.out.println(sbc.capacity());//default 16  
	    sbc.append("Hello");  
	    System.out.println(sbc.capacity());//now 16  
	    sbc.append("java is my favourite language");  
	    System.out.println(sbc.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}
}
