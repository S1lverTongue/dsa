package s1lvertongue.dsa.arrayproblems;

public class StockBuyAndSell {
	
	/**
	 * Given an array prices[] representing stock prices, find
	 * the maximum total profit that can be earned by buying and
	 * selling the stock any number of times.
	 * 
	 * Note: We can only sell a stock which we have bought earlier and we
	 * cannot hold multiple stocks on any day.
	 * 
	 * @param arr
	 * @return
	 */
	public static int buyAndSell(int[] prices) {
		int profit = 0;
		int currentDay = 0;
		int currentStock = prices[currentDay];
		
		int currentMax = 0;
		while (currentDay < prices.length) {
			int j;
			for (j = currentDay + 1; j < prices.length; j++) {
				if (prices[j] - currentStock > currentMax) {
					currentMax = prices[j] - currentStock;
				} else {
					profit += currentMax;
					currentDay += j;
					currentStock = prices[currentDay];
					currentMax = 0;
				}
			}
			currentDay += j;
		}
		
		return profit += currentMax;
	}

}
