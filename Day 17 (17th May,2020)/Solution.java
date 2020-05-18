class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        
        if(p.length()>s.length())
            return list;
        
        int pchars[] = new int[26];
        for(char ch:p.toCharArray())
            pchars[ch-'a'] += 1;
        
        int start=0;
        for(int i=0;i<p.length();i++)
            pchars[s.charAt(i) - 'a' ] -= 1;
        
        int count=0;
        for(int c:pchars)
            if(c!=0)
                count++;
        
        if(count==0)
            list.add(start);
        start++;
        
        while(start<= s.length()-p.length())
        {
            int index1 = s.charAt(start-1) - 'a';
            int index2 = s.charAt(start + p.length()-1) - 'a';
            pchars[index1] += 1;
            if(pchars[index1]==1)
                count+=1;
            else if(pchars[index1]==0)
                count -= 1;
            
            pchars[index2] -= 1;
            if(pchars[index2]==-1)
                count += 1;
            else if(pchars[index2]==0)
                count -= 1;
            
            if(count==0)
                list.add(start);
            start++;
        }
        
            
            
        return list;
    }
}