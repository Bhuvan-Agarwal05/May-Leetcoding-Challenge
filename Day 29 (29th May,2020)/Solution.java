class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] list = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
            list[i] = new ArrayList<>();
        
        for(int[] a:prerequisites)
            list[a[0]].add(a[1]);
        
        int[] visits = new int[numCourses];
        for(int i=0;i<numCourses;i++)
            if(visits[i] == 0 && !DFS(list,visits,i))
                return false;
        
        return true;
    }
    
    public boolean DFS(ArrayList<Integer>[] list,int[] visits,int c)
    {
        if(visits[c] == 1)
            return false;
        
        visits[c]=1;
        for(int a:list[c])
        {
            if(!DFS(list,visits,a))
                return false;
        }
        visits[c]=2;
        return true;
    }
}