package practice_array;

import java.util.HashMap;
import java.util.TreeMap;

public class TimewithKey {
	
	HashMap<String, TreeMap<Integer, String>> hm;
	
	public TimewithKey() {
	 hm= new HashMap();	
	}

	
	
	public void set(String key,String value, int time )
	{
		if(!hm.containsKey(key)){
			hm.put(key , new TreeMap<Integer,String>());
		}
		
		hm.get(key).put(time, value);
	}
	
	public String get(String key, int time )
	{
		TreeMap<Integer, String> tree = hm.get(key);
		String result=tree.get(time);
		
		return result;
	}
	
	public static void main (String [] args)
	{
		TimewithKey twk = new TimewithKey();
		twk.set("ganesh", "Chennai", 2010);
		twk.set("vijay", "Bangalore", 2015);
		System.out.println(twk.get("ganesh", 2010));
		System.out.println(twk.get("vijay", 2015));
	}
}
