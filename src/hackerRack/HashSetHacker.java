package hackerRack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetHacker {
	
	public static void main(String[] args) {

        HashSet  hs = new HashSet ();
        ArrayList<Integer> al = new ArrayList();
        int count = 0; 
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < numCases;i++){
            if(hs.add(sc.nextLine())){
                count++;
            }
           // System.out.println(count);
            al.add(count);
        }
        
        for(int in:al)
        {
        	  System.out.println(in);
        }
    }

}
