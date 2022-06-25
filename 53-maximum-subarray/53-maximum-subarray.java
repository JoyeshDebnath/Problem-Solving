class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int MaxSoFar=Integer.MIN_VALUE;;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            currSum+=nums[i];
            MaxSoFar=Math.max(MaxSoFar,currSum);
           
             if(currSum<0)
            {
                currSum=0;
            }
            
        }
        
        return MaxSoFar;
    }//
}