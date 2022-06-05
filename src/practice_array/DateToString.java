package practice_array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
	
	public static void main(String [] args)
	{
		DateFormat th = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat dat = DateFormat.getDateInstance();
		String date1= dat.format(new Date());
		String date2=th.format(new Date());
		
		System.out.println(date1);
		System.out.println(date2);
	}

}
