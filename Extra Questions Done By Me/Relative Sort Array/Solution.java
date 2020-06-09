class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i:arr1)
            a.add(i);
        
        for(int i:arr2)
        {
            while(a.contains(i))
            {
                list.add(i);
                a.remove(new Integer(i));
            }
        }
        
        if(!a.isEmpty())
        {
            Collections.sort(a);
            list.addAll(a);
        }
        
        int[] out = new int[list.size()];
        int j=0;
        for(int i:list)
        {
            out[j]=i;
            j++;
        }
        return out;
    }
}