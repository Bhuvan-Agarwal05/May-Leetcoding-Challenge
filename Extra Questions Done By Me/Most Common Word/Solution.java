class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        
        String[] words = paragraph.split("[\\p{Punct}\\s]+");  // Most Imp
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(String q:banned)
            list.add(q);
        
        for(String w:words)
        {
            if(!list.contains(w))
            {
                if(map.containsKey(w))
                    map.put(w,map.get(w)+1);
                else 
                    map.put(w,1);
            }
        }
        
        int max=0;
        String temp="";
        for(String w:map.keySet())
        {
            if( map.get(w) > max )
            {
                max = map.get(w);
                temp = w;
            } 
        }
        
        return temp;
    }
}