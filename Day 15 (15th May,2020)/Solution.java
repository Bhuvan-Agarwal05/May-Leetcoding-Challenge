class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int totalSum=0;
        int maxIndex = 0;
        int minIndex = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        for(int x:A)
        {
            totalSum += x;
            maxIndex = Math.max(maxIndex+x,x);
            maxSum = Math.max(maxIndex,maxSum);
            
            minIndex = Math.min(minIndex+x,x);
            minSum = Math.min(minSum,minIndex);
        }
        
        if(maxSum>0)
            return Math.max(maxSum,totalSum-minSum);
        return maxSum;
    }
}