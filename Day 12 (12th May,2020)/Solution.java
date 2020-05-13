class Solution {
    public int singleNonDuplicate(int[] nums) {
       if(nums.length==1)
           return nums[0];
        int left=0,right=1;
        while(right<nums.length)
        {
            if(nums[left]==nums[right])
            {
                left = right + 1;
                right = left + 1;
            }
            else
                break;
        }
        return nums[left];
    }
}