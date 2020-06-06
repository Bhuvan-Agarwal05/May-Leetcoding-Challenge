class Solution {
    public boolean rotateString(String A, String B) {
       /* if(A.length()==0 && B.length()==0)
            return true;
        if(A.length()!=B.length())
            return false;
        else
        {
            ArrayList a = new ArrayList();
            for(int i=0;i<A.length();i++)
                a.add(A.charAt(i));
            char ch;
            int i=A.length();
            while(i!=0)
            {
                ch = (Character)a.remove(0);
                a.add(ch);
                char[] arr = new char[a.size()];
                for(int j=0;j<a.size();j++)
                    arr[j]=(Character)a.get(j);
                String s=new String(arr);
                if(s.equals(B))
                    return true;
                i--;
            }
            return false;
        } */


        // Effective Solution 
        
        int n = A.length();
        if(n==0 && B.length()==0)
            return true;
        
        for(int i=0;i<n;i++)
        {
           // StringBuffer sp = new StringBuffer("");
            A = A.substring(1,n) + A.charAt(0);
            if(A.equals(B))
                return true;
        }
        return false;
    }
}
