class Solution {
    public int numIdenticalPairs(int[] nums) {
    int result = 0;
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i: nums){
        if(map.containsKey(i))
        {
            map.put(i, map.get(i)+1);
            result = result + map.get(i);
            continue;
        }
        map.put(i,0);
    }
    return result;        
    }
}
