class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int sum=0;
        int rem=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        map.put(0,-1);//zero remainder occuring at index =-1 
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            rem=sum%k;
            
            if(rem<0)
                rem+=k;
            
            if(map.containsKey(rem)==true)
            {
                if(i-map.get(rem)>=2)
                    return true;
            }//if map contains the remainder then check if the differnce of indices  is more than or  equal to 2 or not
            else 
            {
                //if map dont contains the remainder then insert the remainder along with uthe the index of occurance 
                map.put(rem,i);
            }
        }//loop
        
        
        return false;
    
    }
}