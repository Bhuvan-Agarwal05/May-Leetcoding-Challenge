class Solution {
    public int firstUniqChar(String s) {
       LinkedHashSet<Character> single = new LinkedHashSet<>();
        HashSet<Character> repeated = new HashSet<>();
        
        for(char c : s.toCharArray()){
            if(repeated.contains(c)) 
                continue;
            if(single.contains(c))
            {
                single.remove(c);
                repeated.add(c);
            }
            else single.add(c);
        }
        if(single.isEmpty()) 
            return -1;
        Iterator<Character> it = single.iterator();
        return s.indexOf(it.next());
    }
}