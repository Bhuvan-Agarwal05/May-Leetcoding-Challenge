class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer s = new StringBuffer("");
        int i=0,flag=1;
        if(strs.length==0)
            return s.toString();
        while(true)
        {
            for(int j=0;j<strs.length-1;j++)
            {
                if(strs[j].length()!=i && strs[j+1].length()!=i)
                {
                    flag=1;  // means all the strings has length upto (i) atleast
                    if(strs[j].charAt(i)!=strs[j+1].charAt(i))
                        return s.toString();
                }
                else
                {
                    flag=0;  // means , all strings in the array is not having length upto (i)
                    break;
                }
            }
            if(flag!=0 && strs[0].length()!=i)  // if all the strings has size upto (i) atleast -> append
            {
                s.append(strs[0].charAt(i));
                i++;
            }
            else
                return s.toString();  // if not then return
        }
    }
}