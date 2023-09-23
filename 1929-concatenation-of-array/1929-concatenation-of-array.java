class Solution {
    public int[] getConcatenation(int[] nums) {
        /*they gave nums array and they mentioned length is n, so we don't know so
        created ln integer variable*/
        int ln = nums.length;
        int ans[] = new int[2*ln];
        for(int i = 0; i<ln; i++){
            ans[i] = nums[i];
            ans[i+ln] = nums[i];
        }
        System.gc();
        return ans;
    }
}