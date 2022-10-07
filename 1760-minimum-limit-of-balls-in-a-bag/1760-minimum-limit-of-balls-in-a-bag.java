class Solution {
    
    public boolean isValid(int penalty,int maxOps,int[] nums){
        int reqOps=0;
        //req number of ops to have maxm val penalty in the nums array 
        for(int n:nums){
            int x=n/penalty;
            if(n%penalty==0)
                x--;
            reqOps+=x;
        }
        return reqOps<=maxOps;
        
    }
    
    
    public int minimumSize(int[] nums, int maxOps) {
        
        int lo=1;
        int hi=0;
        for(int n:nums)
             hi=Math.max(hi,n);
        
        int minPenalty=0;
        
        while(lo<=hi){
            int penalty=lo+(hi-lo)/2;
            if(isValid(penalty,maxOps,nums))
            { 
                minPenalty=penalty;
                hi=penalty-1;
            }
            else 
                lo=penalty+1;
        }
        return minPenalty;
    }
}