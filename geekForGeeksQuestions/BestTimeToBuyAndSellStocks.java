package geekForGeeksQuestions;

public class BestTimeToBuyAndSellStocks {
	
	   public static int maxProfitBruteForce(int[] prices) {
	        int maxDiff = Integer.MIN_VALUE;
	        for(int i = 0 ; i <= prices.length-1 ; i ++){
	            for(int j = i+1 ; j<= prices.length-1 ; j++){
	                int diff = prices[j] - prices[i];
	                if(diff > maxDiff){
	                    maxDiff = diff;
	                }
	            }
	        }
	        if(maxDiff< 0){
	            return 0;
	        }
	        else{
	            return maxDiff;
	        }
	    }
	   
	   public static int maxProfitOptimised(int[] prices) {
		   
		   int minSoFar = Integer.MAX_VALUE;
		   int maxProfit = Integer.MIN_VALUE;
		   
		   for (int i = 0; i < prices.length; i++) {
			 minSoFar = Math.min(minSoFar, prices[i]);
			 int profit = prices[i] - minSoFar;
			 maxProfit = Math.max(maxProfit, profit);
		}
		   if(maxProfit <= 0 ) {
			   return 0;
		   }else {
			   return maxProfit;
		   }
	   }

	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};

		System.out.println(maxProfitBruteForce(prices)+ " : this is brute force Solution");
		System.out.println(maxProfitOptimised(prices)+ " : this is optimised Solution");

	}

}
