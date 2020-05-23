class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> output = new ArrayList<>();
        
        int i,j;
        i=j=0;
        
        while(i<A.length && j<B.length)
        {
            int[] first = A[i];
            int[] second = B[j];
            
            if(first[1] < second[0])
                i++;
            else if(second[1] < first[0])
                j++;
            else
            {
                int low = Math.max(first[0],second[0]);
                int high = Math.min(first[1],second[1]);
                
                output.add(new int[]{low,high});
                
                if(first[1] < second[1]) 
                    i++;
                else if(first[1] >= second[1])
                    j++;
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}