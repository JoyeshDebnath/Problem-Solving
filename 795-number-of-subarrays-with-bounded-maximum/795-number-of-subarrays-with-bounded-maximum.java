class Solution {
    public int numSubarrayBoundedMax(int[] A, int left, int right) {
        
        int res=0;
        int n=A.length;
        int start=-1;
        int last=-1;
        
        for(int i=0;i<n;i++){
            
              if(A[i]>right) 
              {
                  start=last=i;
                  continue;
              }
            if(A[i]>=left)
            {
                last=i;
            }
            
            res+=(last-start);
            
        }//
        
        return res;
    }
}