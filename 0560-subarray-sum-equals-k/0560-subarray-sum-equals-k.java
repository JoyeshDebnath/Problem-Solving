class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);//sum 0 occurs for 1st time ..
        int cumSum=0;
        
        for(int i=0;i<nums.length;i++){
            cumSum+=nums[i];
            if(map.containsKey(cumSum-k))
            {
                ans+=map.get(cumSum-k);
            }
            map.put(cumSum,map.getOrDefault(cumSum,0)+1);
        }
        return ans;
    }
}