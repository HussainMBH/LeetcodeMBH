class Solution {
    public int largestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = 0;
        for(int val : gain){
            currAlt = currAlt + val;
            maxAlt = Math.max(currAlt, maxAlt);
        }
        return maxAlt;
    }
}