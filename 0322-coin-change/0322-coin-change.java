class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        
        for(int x=1; x<dp.length; x++){
            dp[x] = Integer.MAX_VALUE;
            for(int coin : coins){
                if(x >= coin && dp[x-coin] != Integer.MAX_VALUE){
                    dp[x] = Math.min(dp[x], dp[x-coin] +1);
                }
            }
        }
        
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}