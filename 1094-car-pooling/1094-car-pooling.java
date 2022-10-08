class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
     TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int trip[]:trips){
            int from=trip[1];
            int to=trip[2];
            
            map.put(from,map.getOrDefault(from,0)+trip[0]);
            map.put(to,map.getOrDefault(to,0)-trip[0]);
            
            int cnt=0;
            for (Map.Entry<Integer,Integer> entry:map.entrySet()){
                cnt+=entry.getValue();
                if(cnt>capacity)
                       return false;
            }
        }
        return true;
    }
}