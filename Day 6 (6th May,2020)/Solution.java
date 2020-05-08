class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int major=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==major)
                count++;
            else
                count--;
            if(count<0)
            {
                major=nums[i];
                count=0;
            }       
        }
        
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==major)
                count++;
        }
        if(count>nums.length/2)
            return major;
        return -1;
    }
}