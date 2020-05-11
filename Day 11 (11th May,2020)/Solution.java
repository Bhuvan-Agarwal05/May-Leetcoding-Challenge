class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int pixel = image[sr][sc];
        image[sr][sc]=newColor;
        fillColor(image,sr,sc,sr,sc,pixel,newColor);
        return image;
    }
    
    public void fillColor(int[][] image,int sr,int sc,int preR,int preC,int pixel,int newColor)
    {
        if(sr-1>=0 && sr-1<image.length && sc>=0 && sc<image[0].length) 
        {
            if(image[sr-1][sc] == pixel && image[sr-1][sc]!=newColor)
            {
                image[sr-1][sc] = newColor;
                if(preR!=sr-1)
                    fillColor(image,sr-1,sc,sr,sc,pixel,newColor);
            }
        }
        
        
        if(sr>=0 && sr<image.length && sc-1>=0 && sc-1<image[0].length) 
        {
            if(image[sr][sc-1] == pixel && image[sr][sc-1]!=newColor)
            {
                image[sr][sc-1] = newColor;
                if(preC!=sc-1)
                    fillColor(image,sr,sc-1,sr,sc,pixel,newColor);
            }
        }
        
        
        if(sr>=0 && sr<image.length && sc+1>=0 && sc+1<image[0].length) 
        {
            if(image[sr][sc+1] == pixel && image[sr][sc+1]!=newColor)
            {
                image[sr][sc+1] = newColor;
                if(preC!=sc+1)
                    fillColor(image,sr,sc+1,sr,sc,pixel,newColor);
            }
        }
        
        
        if(sr+1>=0 && sr+1<image.length && sc>=0 && sc<image[0].length) 
        {
            if(image[sr+1][sc] == pixel && image[sr+1][sc]!=newColor)
            {
                image[sr+1][sc] = newColor;
                if(preR!=sr+1)
                    fillColor(image,sr+1,sc,sr,sc,pixel,newColor);
            }
        }
        
    }
}