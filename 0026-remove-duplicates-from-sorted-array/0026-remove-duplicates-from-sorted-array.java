class Solution {
    public int removeDuplicates(int[] nums) {
        int numsindex=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[numsindex] = nums[i];
                numsindex++;
            }
        }
        return numsindex;
    }
}