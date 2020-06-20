class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int row = points.length;
        HashMap<Integer,Float> map = new HashMap<>();
        for(int i=0;i<row;i++)
        {
            float dist = (float)Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            map.put(i,dist);
        }
        
        Map<Integer, Float> map2 = sortByValues(map); 
        int[][] output = new int[K][2];
        int j=0;
        for(int i:map2.keySet())
        {
            if(K!=0)
            {
                output[j][0]=points[i][0];
                output[j][1]=points[i][1];
                K--;
                j++;
            }
            else
                break;
        }
        return output;
        
    }
    private HashMap sortByValues(HashMap map) { 
       List list = new LinkedList(map.entrySet());
       // Defined Custom Comparator here
       Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o1)).getValue())
                  .compareTo(((Map.Entry) (o2)).getValue());
            }
       });
       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }
}