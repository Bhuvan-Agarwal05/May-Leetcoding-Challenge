class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2))
            return 0;
        else if(word1.length()==0)
            return word2.length();
        else if(word2.length()==0)
            return word1.length();
        else if(word1.contains(word2))
            return word1.length()-word2.length();
        else
        {
            int M = word1.length();
		    int N = word2.length();
		    int dp[][] = new int[M + 1][N + 1];

            for (int i = 0; i <= M; i++) {
                dp[i][0] = i;
            }
            for (int i = 0; i <= N; i++) {
                dp[0][i] = i;
            }

            for (int i = 1; i <= M; i++) {
                for (int j = 1; j <= N; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    }
                }
            }
            return dp[M][N];      
        }
       
    }
}