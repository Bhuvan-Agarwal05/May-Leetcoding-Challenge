class Solution {
    public int numUniqueEmails(String[] emails) {
        TreeSet<String> set = new TreeSet<>();
        for(String s:emails)
        {
            String[] str = s.split("@");
            StringBuffer sp = new StringBuffer("");
            for(int i=0;i<str[0].length() && str[0].charAt(i)!='@' ; i++)
            {
                if(str[0].charAt(i)=='+')
                    break;
                else if(str[0].charAt(i)=='.')
                    continue;
                else
                    sp.append(str[0].charAt(i));
                
            }
            
            
            sp.append("@"+str[1]);
            System.out.println(sp.toString());
            set.add(sp.toString());
        }
        
        return set.size();
    }
}