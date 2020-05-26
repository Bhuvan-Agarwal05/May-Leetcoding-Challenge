class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int a = A.length;
        int b = B.length;
        
        int[][] dp = new int[a+1][b+1];
       for(int i= 1;i<a+1;i++)
           {
           for(int j=1;j<b+1;j++)
               dp[i][j]= A[i-1]==B[j-1]?1+dp[i-1][j-1]:Math.max(dp[i-1][j],dp[i][j-1]);
           }
        return dp[a][b];
        }
    }