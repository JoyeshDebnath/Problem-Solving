class Solution {
    public int findMaxLength(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int Ans=0;
        int cumSum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                   cumSum+=(-1);
            else 
                   cumSum+=1;
            
            if(map.containsKey(cumSum)==false)
                   map.put(cumSum,i);
            else 
                Ans=Math.max(Ans,i-map.get(cumSum));
                
        }
        
        return Ans;
    }
}
 