class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i+=count)
        {
            count=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    count++;
                else
                    break;
            }
            if(count > nums.length/3 )
                list.add(nums[i]);
        }
        return list;
    }
}