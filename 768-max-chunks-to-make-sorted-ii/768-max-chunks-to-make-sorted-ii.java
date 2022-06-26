class Solution {
    public int maxChunksToSorted(int[] A) {
        int n=A.length;
        int maxOfLeft[]=new int[n];
        int minOfRight[]=new int[n];
        
        maxOfLeft[0]=A[0];
        minOfRight[n-1]=A[n-1];
        
        for(int i=1;i<n;i++)
              maxOfLeft[i]=Math.max(maxOfLeft[i-1],A[i]);
        
        for(int i=n-2;i>=0;i--)
              minOfRight[i]=Math.min(minOfRight[i+1],A[i]);
        
        int counter=0;
        
        for(int i=0;i<n-1;i++)
        {
              if(maxOfLeft[i]<=minOfRight[i+1])
                     counter++;
        }
        
        return counter+1;
        
        
        
    }
}