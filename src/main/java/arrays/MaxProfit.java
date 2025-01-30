package arrays;

public class MaxProfit {
        /* 
        Leetcode Problem - 121
        Problem Statement:
        You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`-th day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        
        Time complexity - O(n), as we only traverse the array once.
        Space complexity - O(1), since we use only a constant amount of extra space.
        */
        
        public static int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        for (int i=1; i<prices.length; i++){
            int currentPrice = prices[i];
            int currentProfit = currentPrice-minPrice;
            if (currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
            if (currentPrice<minPrice){
                minPrice = currentPrice;
            }
        }
        return maxProfit;
    }
}
