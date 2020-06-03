class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] output = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(A[i][j]==0)
                    output[i][n-1-j]=1;
                else
                    output[i][n-1-j]=0;
            }
        }
        return output;
    }
}