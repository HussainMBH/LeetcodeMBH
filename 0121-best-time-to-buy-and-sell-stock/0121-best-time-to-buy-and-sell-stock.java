class Solution {
    public int maxProfit(int[] prices) {
        
        int buyingprice = prices[0]; //assumely assign starting value
        int profit =0; //Initialized
        for(int i=1; i<prices.length; i++){
            if(prices[i]<= buyingprice){
                buyingprice = prices[i];
            }
            profit = Math.max(profit, (prices[i] - buyingprice));
        }
        return profit;
       
    }
}