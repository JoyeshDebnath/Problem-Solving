class Solution {
    public int maxChunksToSorted(int[] A) {
        
        int n=A.length;
        int max[]=new int[n];
        
        max[0]=A[0];
        
        for(int i=1;i<n;i++)
        {
             max[i]=Math.max(max[i-1],A[i]);
        }
        
        int counter=0;
        
        for(int i=0;i<n;i++)
        {
            if(max[i]==i)
                    counter++;
        }
        
        return counter;
    }
}