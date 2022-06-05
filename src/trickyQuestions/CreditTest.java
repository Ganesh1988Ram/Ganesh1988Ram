package trickyQuestions;

import java.util.Scanner;

class Credit {
	char[][] boxArray;
	int w, h;
	public Credit(int w, int h) {
		h=h+2;
		w= w+2;
		//System.out.println(h);
		//System.out.println(w);
		this.w = w;
		this.h = h;
		boxArray = new char[h][w];		
		
		
		taskOne(0, 0, this.w-1, 0, '-');taskOne(0, this.h-1, this.w-1, this.h-1, '-');
		
		taskOne(0, 1, 0, this.h-2, '|');taskOne(this.w-1, 1, this.w-1, this.h-2, '|');
		
				
	}
	
	public void taskOne(int x1, int y1, int x2, int y2, char mc) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				boxArray[i][j] = mc;				
			}
		}		 
  	} 
	public void view() {		
		for(int i=0;i<this.h;i++) {
			for(int j=0;j<this.w;j++) {				 
				System.out.print(boxArray[i][j]);
			}
			System.out.println();
		}
	}
	

	
	public void secondTask(int x1, int y1, int x2, int y2, char mc) {
		taskOne(x1,y1, x2, y1, mc);
		taskOne(x1,y1, x1, y2, mc);
		taskOne(x2,y1, x2, y2, mc);
		taskOne(x1,y2, x2, y2, mc);
	}
	
	public void lastTask(int x, int y, char mc) throws InterruptedException {
		if((int)boxArray[y][x] != 0) {
			return;
		}
		
		if(x > 0 || x < this.h || y > 0 || y  < this.w) {
			if((int)boxArray[y][x] == 0)
				boxArray[y][x] = mc;
			lastTask(x+1,y, mc);
			lastTask(x-1,y, mc);
			lastTask(x,y-1, mc);
			lastTask(x,y+1, mc);			
		}
	}
}

public class CreditTest {	
	static Credit box;
	public static void main(String[] args) throws NumberFormatException, InterruptedException  {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		
		do {
			System.out.print("enter command:");
			command = scan.nextLine();
			box(command);
		}while(!command.equals("Q"));
		
		System.out.println("EXIT!");
		scan.close();
	}
	
	private static void box(String input) throws NumberFormatException, InterruptedException {
		char ch = input.charAt(0);
		String[] cmd;
		try {
			switch(ch) {
				case 'C' :
					cmd = input.split(" ");
					box = new Credit(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
					box.view();
				break;
				case 'L' :
					cmd = input.split(" ");
					if(box == null){
						System.out.println("Canvas not found");
						return;
					}
					box.taskOne(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
					box.view();
				break;
				case 'R' :
					cmd = input.split(" ");
					if(box == null){
						System.out.println("Canvas not found");
						return;
					}
					box.secondTask(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
					box.view();
				break;
				case 'B' :
					cmd = input.split(" ");
					if(box == null){
						System.out.println("Canvas not found");
						return;
					}
					box.lastTask(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),cmd[3].charAt(0));
					box.view();
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

