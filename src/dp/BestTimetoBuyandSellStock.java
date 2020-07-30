package dp;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {

		
		int[] prices={};
		
		System.out.println(maxProfit(prices));
		
		
	}

	public static int maxProfit(int[] prices) {
		int maxProfit=0;
		
		for(int i=0;i<prices.length;i++){
			
			int nextMax=nextMax(i, prices);
			
			if(maxProfit<(nextMax-prices[i])){
				maxProfit=nextMax-prices[i];
			}
			
			
		}
		return maxProfit;
	}
	
	public static int nextMax(int n,int[] prices){
		
		int ele=prices[n];
		int nextMax=-1;
		
		for(int i=n+1;i<prices.length;i++){
			if(ele<prices[i]){
				nextMax=prices[i];
				ele=nextMax;
			}
		}
		return nextMax;
		
	}

}
