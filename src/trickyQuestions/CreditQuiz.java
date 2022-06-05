package trickyQuestions;

import java.util.Scanner;


abstract class CreditQu {
	
	char[][] rectangle;
	int width, height;
	
	public CreditQu()
	{
		
	}
	
	
	public void result() {		
		for(int i=0;i<this.height;i++) {
			for(int j=0;j<this.width;j++) {				 
				System.out.print(rectangle[i][j]);
			}
			System.out.println();
		}
	}
	
	
    public abstract void creditA(int w, int h);
    public abstract void taskOneA(int x1, int y1, int x2, int y2, char mc);
    public abstract void secondTask(int x1, int y1, int x2, int y2, char mc);
    public abstract void lastTask(int x, int y, char mc);
}

class SubQuiz extends CreditQu {

	
	public SubQuiz() {}

	public SubQuiz(int width, int height) {
		
		height=height+2;
		width= width+2;
		//System.out.println(h);
		//System.out.println(w);
		this.width =width;
		this.height = height;
		rectangle = new char[height][width];		
		
		
		taskOneA(0, 0, this.width-1, 0, '-');taskOneA(0, this.height-1, this.width-1, this.height-1, '-');
		
		taskOneA(0, 1, 0, this.height-2, '|');taskOneA(this.width-1, 1, this.width-1, this.height-2, '|');
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creditA(int w, int h) {
		// TODO Auto-generated method stub
		h=h+2;
		w= w+2;
		//System.out.println(h);
		//System.out.println(w);
		this.width = w;
		this.height = h;
		rectangle = new char[h][w];		
		
		
		taskOneA(0, 0, this.width-1, 0, '-');taskOneA(0, this.height-1, this.width-1, this.height-1, '-');
		
		taskOneA(0, 1, 0, this.height-2, '|');taskOneA(this.width-1, 1, this.width-1, this.height-2, '|');
		
	}

	@Override
	public void taskOneA(int x1, int y1, int x2, int y2, char mc) {
		// TODO Auto-generated method stub
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				rectangle[i][j] = mc;				
			}
		}	
	}

	@Override
	public void secondTask(int x1, int y1, int x2, int y2, char mc) {
		// TODO Auto-generated method stub
		taskOneA(x1,y1, x2, y1, mc);
		taskOneA(x1,y1, x1, y2, mc);
		taskOneA(x2,y1, x2, y2, mc);
		taskOneA(x1,y2, x2, y2, mc);
		
	}

	@Override
	public void lastTask(int x, int y, char mc) {
		// TODO Auto-generated method stub
		if((int)rectangle[y][x] != 0) {
			return;
		}
		
		if(x > 0 || x < this.height || y > 0 || y  < this.width) {
			if((int)rectangle[y][x] == 0)
				rectangle[y][x] = mc;
			lastTask(x+1,y, mc);
			lastTask(x-1,y, mc);
			lastTask(x,y-1, mc);
			lastTask(x,y+1, mc);			
		}
	}
	
	
}


public class CreditQuiz {	
	static SubQuiz squ;
	public static void main(String[] args)   {		
		Scanner input = new Scanner(System.in);
		String userValues = new String();
		
		do {
			System.out.print("enter command:");
			userValues = input.nextLine();
			try {
				box(userValues);
			} catch (NumberFormatException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(!userValues.equals("Q"));
		
		System.out.println("EXIT!");
		input.close();
	}
	
	private static void box(String input) throws NumberFormatException, InterruptedException {
		char ch = input.charAt(0);
		String[] inp;
		
		SubQuiz qu = new SubQuiz();
		try {
			switch(ch) {
				case 'C' :
					inp = input.split(" ");
					squ =new SubQuiz(Integer.parseInt(inp[1]),Integer.parseInt(inp[2]));
					squ.result();
				break;
				case 'L' :
					inp = input.split(" ");
					if(squ == null){
						System.out.println("Canvas not found");
						return;
					}
					qu.taskOneA(Integer.parseInt(inp[1]),Integer.parseInt(inp[2]),Integer.parseInt(inp[3]),Integer.parseInt(inp[4]),'X');
					squ.result();
				break;
				case 'R' :
					inp = input.split(" ");
					if(squ == null){
						System.out.println("Canvas not found");
						return;
					}
					qu.secondTask(Integer.parseInt(inp[1]),Integer.parseInt(inp[2]),Integer.parseInt(inp[3]),Integer.parseInt(inp[4]),'X');
					squ.result();
				break;
				case 'B' :
					inp = input.split(" ");
					if(squ == null){
						System.out.println("Canvas not found");
						return;
					}
					qu.lastTask(Integer.parseInt(inp[1]),Integer.parseInt(inp[2]),inp[3].charAt(0));
					squ.result();
				break;
			}
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println(e.getMessage());
			System.out.println("commant is not valid!!\n");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Wrong input or Error\n");
			System.exit(1);
		}
	}
}