class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyingprice = prices[0];
        for(int i =0; i<prices.length; i++){
            if(prices[i] <buyingprice){
                buyingprice = prices[i];
            }
            profit = Math.max(profit, (prices[i] - buyingprice));
        }
        return profit;
    }
}