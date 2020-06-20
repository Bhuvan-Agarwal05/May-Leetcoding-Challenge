class Solution {
    public String longestPalindrome(String s) {
        int frame = s.length();
        while(frame!=0)
        {
            for(int i=0;i<=s.length()-frame;i++)
            {
                String sp = s.substring(i,i+frame);
                if(isPalindrome(sp))
                    return sp;
            }
            frame--;
        }
        return s;
    }
    
    public boolean isPalindrome(String s)
    {
        int low = 0;
        int high=s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}