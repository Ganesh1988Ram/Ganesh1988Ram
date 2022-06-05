package practice_array;



public class ShareMarketArray {
    public static int maxProfit(int[] prices) {
        //Kadane's algorithm
        if(prices.length == 0) {
            return 0;
        }
        
        int max = 0;
        int min = prices[0];
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        
        return max;
    }
	// Driver code
	    public static void main(String[] args)
	    {
	    	int [] price= {7, 2, 5, 22, 6, 4};
	        // stock prices on consecutive days
         	        int n = price.length;
	 
	        // function call
	        System.out.println(maxProfit(price));
	    }
	}