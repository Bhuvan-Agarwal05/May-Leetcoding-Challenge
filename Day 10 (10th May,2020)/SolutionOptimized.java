class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustIn = new int[N + 1];
        int[] trustOut = new int[N + 1];
        
        for(int i = 0; i < trust.length; i++){
            ++trustOut[trust[i][0]];
            ++trustIn[trust[i][1]];
        }
        
        for(int i = 1; i <= N; i++){
            if(trustIn[i] == N - 1 && trustOut[i] == 0){
                return i;
            }
        }
        return -1;
        }
        
    }