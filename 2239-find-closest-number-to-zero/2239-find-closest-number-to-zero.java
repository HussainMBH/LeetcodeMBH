class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int close=0;
        for(int e: nums)
        {
            if(min>Math.abs(e))
            {
                min=Math.abs(e);
                close=e;
            }

            else if(min == Math.abs(e) && close <e)
            {
                close = e;
            }
        }
        return close;
    }
}