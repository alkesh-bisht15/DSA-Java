package LeetCode.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            int price = prices[i];
            int profit = price - buyPrice;
            if (maxProfit < profit){
                maxProfit = profit;
            }
            if (price < buyPrice){
                buyPrice = price;
            }
        }
        return maxProfit;
    }
}
