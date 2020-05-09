class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)
            return true;
        
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];
        float slope = calSlope(point1,point2);
        
        for(int i=2;i<coordinates.length;i++)
        {
            int[] p1 = coordinates[i];
            int[] p2 = coordinates[0];
            
            float s = calSlope(p1,p2);
            if(slope!=s)
                return false;
        }
        return true;
    }
    
    public float calSlope(int[] p1,int[] p2)
    {
        int x1,y1,x2,y2;
        x1 = p1[0];
        y1 = p1[1];
        x2 = p2[0];
        y2 = p2[1];
        if(x2-x1==0)
            return 0;
        return ( (float)Math.abs(y2 - y1) / Math.abs(x2 - x1) );
    }
}