class Solution {
    public int minSubarray(int[] nums, int p) {
      
        int total=0;
        
        for(int n:nums)
              total=(total+n)%p;
        
        if(total%p==0)
              return 0;
      
        int res=Integer.MAX_VALUE;
        
        Map<Integer,Integer> map=new HashMap<>();
        int currRem=0;
        
        int target=total%p;
        
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            currRem=(currRem+nums[i])%p;
            map.put(currRem,i);
            int mod=(currRem-target+p)%p;
            if(map.containsKey(mod))
                res=Math.min(res,i-map.get(mod));
        }
        
       if (res == Integer.MAX_VALUE || res == nums.length) {
    res = -1;
     }
      return res;  
    }
}