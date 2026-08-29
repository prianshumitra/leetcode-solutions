class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_Profit = 0;

        for(int i=1; i<prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            else {
                max_Profit = Math.max(max_Profit, prices[i]-min);
            }
        }
        return max_Profit;
    }
}