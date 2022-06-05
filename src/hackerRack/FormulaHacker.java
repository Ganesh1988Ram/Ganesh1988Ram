package hackerRack;

import java.util.Scanner;

public class FormulaHacker {
	
	/*public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a =0,b=0,n=0;
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
             arrange(a,b,n);
        }
        in.close();
    }

        public static void arrange(int a,int b,int n){
        int sum = a+b;
        for(int j=1; j<=n; j++){
            System.out.print(sum+" ");
            sum+=((Math.pow(2,j))*b);
        }
        System.out.println();
    }*/
	
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){

	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int count = 0;
	            for(int j=0;j<n;j++) {

	                    System.out.print((int)(a+b*(Math.pow(2,j + 1)-1))+" ");
	            }
	            System.out.println();
	        }
	        in.close();
	    }
}
