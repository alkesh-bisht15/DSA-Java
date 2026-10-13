public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: " + profit);
    }
    static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (price < minPrice) {
                minPrice = price;
            }   
        }

        return maxProfit;
    }
}
//Time Complexity : O(n) where n is the length of prices array.
//Auxiliary space Complexity : O(1) as we are using constant space.