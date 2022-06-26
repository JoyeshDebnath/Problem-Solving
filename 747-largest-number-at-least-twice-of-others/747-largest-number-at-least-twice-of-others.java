class Solution {
    public int dominantIndex(int[] A) {
        int secMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<A.length;i++)
        {
             if(A[i]>max)
             {
                 secMax=max;
                 max=A[i];
                 index=i;
             }
            
            else if(A[i]>secMax)
             {
                      secMax=A[i];
             }
               
            
        }//loop
        
        
        return (secMax*2<=max)?index:-1;
    }
}