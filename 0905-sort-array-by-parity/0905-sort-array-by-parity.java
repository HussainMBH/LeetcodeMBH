class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(true){
            while(left < nums.length && nums[left] %2 ==0) left++;
            while(right >= 0 && nums[right] %2 ==1) right--;
            
            if(left >= right) break;
            
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        
        return nums;
    }
}