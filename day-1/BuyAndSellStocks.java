// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

/* 
EXPLANATION: 
In order to maximize profit, we must have the owest possible Buying Price and highest Selling price. To have lowest BP, we compare it to each price and calculate profit. 
If BP < price of the day, BP = price of that day since in that case there is no profit. 
We compare profit to maxProfit.
*/
  
class Solution {
    public int maxProfit(int[] prices) {
        int BP = Integer.MAX_VALUE; 
        int maxProfit = 0; 
        for(int i=0; i<prices.length; i++) {
            if(BP < prices[i]) {
                int profit = prices[i] - BP; 
                maxProfit = Math.max(profit, maxProfit); 
            } else {
                BP = prices[i]; 
            } 
        }
        return maxProfit; 
    }
}

