class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        
       ArrayList list = new ArrayList();
        for(char c:s.toCharArray())
        {
            if(!list.contains(c))
                list.add(c);
        }
        
        StringBuffer sbuf = new StringBuffer();
        for(int i=0;i<list.size();)
        {
            int max = map.get(list.get(i));
            int max_index = i;
            for(int j=i+1;j<list.size();j++)
            {
                if(map.get(list.get(j)) > max)
                {
                    max = map.get(list.get(j));
                    max_index = j;
                }
            }
            while(max!=0)
            {
                sbuf.append((char)list.get(max_index));
                max--;
            }
            list.remove(max_index);
        }
        return sbuf.toString();    
    }
}