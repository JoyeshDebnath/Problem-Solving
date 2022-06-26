class Solution {
    public int[] productExceptSelf(int[] A) {
        
        int left=1;
        int right=1;
        int n=A.length;
        int Result[]=new int[n];
        
        
        for(int i=0;i<n;i++)
        {
            if(i>0 )
            {
                left=left*A[i-1];
            }
            
            Result[i]=left;
        }//fill the result with calculation of left 
        
        
        for (int i=n-1;i>=0;i--)
        {
            if(i<(n-1))
            {
                right=right*A[i+1];
            }
            
            Result[i]=Result[i]*right;
            
        }//compute the right subarray ontribuion ...

       
        return Result;
        
    }
}