package hackerRack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortStudents {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Students> studentLists = new ArrayList<Students>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Students st = new Students(id, fname, cgpa);
	         studentLists.add(st);
	         
	         testCases--;
	      }
	     // Collections.sort(studentList);
	      
	      
	      //java8 sort
	      
	      Comparator<Students> compare = Comparator
                  .comparing(Students::getCgpa);
               //   .thenComparing(Students::getFname).thenComparing(Students::getId);
	      
	      
	      List<Students> sortedS= studentLists.stream()
	                      .sorted(compare)
	                      .collect(Collectors.toList());
	      
	      System.out.println(sortedS.toString());
	      
	         for(Students st: sortedS){
	         System.out.println(st.getFname());
	      }
	}
}
