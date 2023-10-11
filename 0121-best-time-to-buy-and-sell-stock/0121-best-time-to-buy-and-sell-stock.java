class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null|| prices.length == 0){
            return 0;
        }
        int buying_price = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] <=buying_price){
                buying_price = prices[i];
                continue;
            }
            profit = Math.max(profit, prices[i] - buying_price);
        }
        return profit;
    }
}