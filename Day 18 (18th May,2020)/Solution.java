class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        
        int required[]=new int[26];
        for(char ch:s1.toCharArray())
            required[ch-'a'] += 1;
        
        int start=0;
        for(int i=0;i<s1.length();i++)
            required[s2.charAt(i) - 'a'] -= 1;
        
        boolean match = true;
        for(int i:required)
        {
            if(i!=0)
            {
                match=false;
                break;
            }
        }
        
        if(match) return true;
        start++;
        
        
        while(start <= s2.length()-s1.length())
        {
            int index1 = s2.charAt(start - 1) - 'a';
            int index2 = s2.charAt(start+s1.length()-1) - 'a';
            required[index1] += 1;
            required[index2] -= 1;
            
            match = true;
            for(int i:required)
            {
                if(i!=0)
                {
                    match=false;
                    break;
                }
            }

            if(match) return true;
            start++;
        }
        return false;
    }
}   