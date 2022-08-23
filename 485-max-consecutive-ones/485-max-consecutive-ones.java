class Solution {
    public int findMaxConsecutiveOnes(int[] A) {
        int n=A.length;
     	int start=0;
		int end=0;
        int len=0;
        int max=Integer.MIN_VALUE;

		while(end<n)
		{

              if(A[end]==1)
              	       len++;

              else if(A[end]==0){
              	max=Math.max(max,len);
              	len=0;
              	
              }

              end++;
		}//

		max=Math.max(max,len);
        return max;
    }
}