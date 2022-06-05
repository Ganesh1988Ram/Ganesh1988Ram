package hackerRack;

public class ArraySunConta_KanadeAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int [] a = {-2, -3, 4, -1, 2, 11, 10, -3};
	        System.out.println("Maximum contiguous sum is " +
	                                       maxSubArraySum(a));
	}
	        static int maxSubArraySum(int a[])
	        {
	        	
	        	int size = a.length;
	            int max = Integer.MIN_VALUE, price = 0;
	            
	            for (int i = 0; i < size; i++)
	            {
	            	price = price + a[i];
	                if (max < price)
	                    max = price;
	                if (price < 0)
	                     price= 0;
	            }
	            return max;
	        }

	}


