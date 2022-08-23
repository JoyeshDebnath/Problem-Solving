class Solution {
    public int longestOnes(int[] A, int k) {
        
        int start=0;
		int end=0;
		int len=0;
		int maxLength=0;
        int N=A.length;

		while(end<N)
		{
            if(A[end]==0)
            	k--;

           
            	//all zeros exhausted ... 
               
            	while(k<0)
            	{
            		if(A[start]==0)
            			k++;
            		
                     start++;
            	}

             maxLength=Math.max(maxLength,end-start+1);
            end++;
            }//
   return maxLength;
    }
}