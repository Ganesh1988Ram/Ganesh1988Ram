package practiceDataStru;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	//************************hashmap vs hashtable*************************************
    public static void main(String args[]) {

        // hashtable  
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>(); 
        ht.put(101," ajay"); 
        ht.put(101,"Vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(103,"Rahul"); 
        ht.put(104,"Rahul"); 
       // ht.put(null,"Rahul"); 

        System.out.println("Hash table: "); 
        for (Entry<Integer, String> m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
  
        // hashmap 
        HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
        hm.put(100,"Amit"); 
        hm.put(104,"Amit"); 
        hm.put(104,"Amit");  
        hm.put(101,"Vijay"); 
        hm.put(102,"Rahul"); 
        hm.put(null,"Rahul"); 
        hm.put(null,"res"); 
        System.out.println("Hash map: "); 
        for (Entry<Integer, String> m:hm.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
        
        
        //****************************************LinkedHashMap*************************************
        
        Map<String, String> mapContacts = new LinkedHashMap<>();
        
        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0981127421", "John");
         
        System.out.println(mapContacts);
        
        //*************************TeeMap*******************************************************
        Map<String, String> mapLang = new TreeMap<>();
        
        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");
         
        System.out.println(mapLang);
        
    } 
	
}
