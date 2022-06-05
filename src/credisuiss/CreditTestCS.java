package credisuiss;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class CreditTestCS {	
	static Credit rectangle;
	public static void main(String[] args)   {		
		Scanner scanner = new Scanner(System.in);String input = new String();
	
		do {
			System.out.print("enter command:");
			input = scanner.nextLine();
			try {
				rectangle(input);
			} catch (NumberFormatException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(!input.equals("Q"));
		
		System.out.println("EXIT!");
		scanner.close();
	}
	
	private static void rectangle(String input) throws NumberFormatException, InterruptedException {
		char ch = input.charAt(0);
		String[] task;
		try {
			switch(ch) {
				case 'C' :
					task = input.split(" ");
					rectangle = new Credit(Integer.valueOf(task[1]),Integer.valueOf(task[2]));
					rectangle.result();
				break;
				case 'L' :
					task = input.split(" ");
					if(rectangle == null){
						System.out.println("Canvas not found");
						return;
					}
					rectangle.firstTask(Integer.valueOf(task[1]),Integer.valueOf(task[2]),Integer.valueOf(task[3]),Integer.valueOf(task[4]),'X');
					rectangle.result();
				break;
				case 'R' :
					task = input.split(" ");
					if(rectangle == null){
						System.out.println("Canvas not found");
						return;
					}
					rectangle.secondTask(Integer.valueOf(task[1]),Integer.valueOf(task[2]),Integer.valueOf(task[3]),Integer.valueOf(task[4]),'X');
					rectangle.result();
				break;
				case 'B' :
					task = input.split(" ");
					if(rectangle == null){
						System.out.println("Canvas not found");
						return;
					}
					rectangle.AssignZ(Integer.valueOf(task[1]),Integer.valueOf(task[2]),task[3].charAt(0));
					rectangle.result();
				break;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("commant is not valid!!\n");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Wrong input or Error\n");
			e.printStackTrace();
			System.exit(1);
		}
	}
}

class Credit {
	char[][] recArray;
	int wid, height;
	
	List<Character> harray = new ArrayList<Character>();
	public Credit(int wid, int height) {
		height=height+2;
		wid= wid+2;
		this.wid = wid;
		this.height = height;
		recArray = new char[height][wid];	
					
	   firstTask(0, 0, this.wid-1, 0, '-');firstTask(0, this.height-1, this.wid-1, this.height-1, '-');
	   firstTask(0, 1, 0, this.height-2, '|');firstTask(this.wid-1, 1, this.wid-1, this.height-2, '|');
						
	}
	
	public void firstTask(int x1, int y1, int x2, int y2, char value) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				recArray[i][j] = value;		
			
			}
		}		 
  	} 
	
	public void secondTask(int x1, int y1, int x2, int y2, char value) {
		firstTask(x1,y1, x2, y1, value);firstTask(x1,y1, x1, y2, value);firstTask(x2,y1, x2, y2, value);firstTask(x1,y2, x2, y2, value);
	}	
	public void AssignZ(int x, int y, char value)  {
		if((int)recArray[y][x] != 0) {
			return;
		}		
		if(x > 0 || x < this.height || y > 0 || y  < this.wid) {
			if((int)recArray[y][x] == 0)
				recArray[y][x] = value;
			AssignZ(x+1,y, value);AssignZ(x-1,y, value);AssignZ(x,y-1, value);AssignZ(x,y+1, value);			
		}
	}
	
	public void result() {		
		for(int i=0;i<this.height;i++) {
			for(int j=0;j<this.wid;j++) {				 
				System.out.print(recArray[i][j]);
			
			}
			System.out.println();
		}
	}
}



