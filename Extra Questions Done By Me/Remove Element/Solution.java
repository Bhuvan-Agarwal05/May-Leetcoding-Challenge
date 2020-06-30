class Solution {
    public int removeElement(int[] nums, int val) {
       int len = nums.length;
        int high=len-1;
        for(int i=0;i<nums.length && i<=high;i++)
        {
            if(nums[i]==val)
            {
                if(nums[high]!=val)
                {
                    nums[high]^=nums[i];
                    nums[i]^=nums[high];
                    nums[high]^=nums[i];
                    high--;
                    len--;
                }
                else
                {
                    high--;
                    i--;
                    len--;
                }
            }
        }
        return len;
    }
}