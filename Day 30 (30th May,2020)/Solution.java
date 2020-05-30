class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int i = 0;
        for (int[] point : points) {
        	map.put(i, Math.sqrt((point[0]*point[0]) + (point[1]*point[1])));
			i++;
		}
        
        List<Map.Entry<Integer, Double>> list = new LinkedList<Map.Entry<Integer,Double>>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
        	return o1.getValue().compareTo(o2.getValue());
        });
        
        int[][] pairs = new int[K][2];
        int index = 0;
        for (Map.Entry<Integer, Double> entry : list) {
        	if (K-- > 0) {
    			int[] arr = points[entry.getKey()];
    			pairs[index++] = arr;
			}
		}
        return pairs;
    }
}