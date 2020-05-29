class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        if(s.length()==1)
            return map.get(s.charAt(0));
        
        int ans = 0,i;
        char c = s.charAt(0);
        for(i=1;i<s.length();)
        {
            if( map.get(s.charAt(i)) <= map.get(c))  // If first char is less than or equal to second char and so on...
            {
                ans += map.get(c); 
                c = s.charAt(i);
                i++;
            }
            else
            {
                ans += map.get(s.charAt(i)) - map.get(c);  // If  second char is greater than 1st char (subtract)
                if(i+1 < s.length())
                    c = s.charAt(i+1);
                i=i+2;
            }  
        }
        if(i==s.length())
            ans += map.get(c);
        return ans;
    }
}