class Solution {
    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int colRecord[] = new int[col];
        
        int topleft = 0;
        int answer = 0;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==1)
                {
                    int top = (i==0)?0:colRecord[j];
                    int left = (j==0)?0:colRecord[j-1];
                    
                    colRecord[j] = 1 + Math.min(Math.min(top,left),topleft);
                    answer += colRecord[j];
                    
                    topleft = (j==col-1)?0:top;
                }
                else
                {
                    colRecord[j] = 0;
                }
            }
        }
        return answer;
    }
}