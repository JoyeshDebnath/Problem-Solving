class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo=1;
        int hi=0;
        for(int ele:nums)
        {
            hi=Math.max(hi,ele);
        }
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            
            boolean check=checkValid(nums,mid,threshold);
            if(check==true)
                   hi=mid-1;
            
            else 
                  lo=mid+1;
        }
        
        return lo;
    }
    
    boolean checkValid(int[] A,int mid,int threshold)
    {
        double m=1.0*mid;
        int sum=0;
        
        for(int ele:A)
        {
            sum+=(int)Math.ceil(ele/m);
        }
        return (sum<=threshold);
    }
}