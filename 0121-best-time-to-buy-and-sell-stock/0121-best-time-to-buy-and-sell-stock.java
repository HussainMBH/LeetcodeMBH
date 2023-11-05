class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buying = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buying){
                buying  = prices[i];
            }
            
            profit = Math.max(profit, (prices[i] - buying));
        }
        return profit;
    }
}