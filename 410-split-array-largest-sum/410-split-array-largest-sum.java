class Solution {
    public int splitArray(int[] nums, int m) {
        int lo=0;
        int hi=0;
         
        for(int ele:nums)
        {
            lo=Math.max(lo,ele);
            hi+=ele;
        }
        if(nums.length==m)
            return lo;
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(isValid(nums,mid,m)==true)
            {
                hi=mid-1;
            }
            else 
                 lo=mid+1;
        }
        
        return lo;
    }
    
    boolean isValid(int nums[],int mid,int m)
    {
        int count=1;//no of subarrays 
        //mid -->> req sum 
        //m --> no of subarray allowed 
        int curr=0;
        
        for(int num:nums)
        {
            curr+=num;
            if(curr>mid)
            {
                curr=num;
                count++;
            }
        }
        
        return (count<=m);
        //if true then valid 
        //if false then there are more partitions than requirered ie invalid 
    }
}