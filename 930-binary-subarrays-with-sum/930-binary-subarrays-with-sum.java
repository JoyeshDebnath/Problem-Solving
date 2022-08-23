class Solution {
    public int numSubarraysWithSum(int[] A, int target) {
        
        int start=0;
		int end=0;
        int N=A.length;
        int sum=0;
        int counter=0;

		while(end<N){
          sum+=A[end];
          while(sum>target && start<end){
          	sum-=A[start];
          	start++;
          }
        if(sum==target)
        	counter++;
         
         int i=start;

          while(i<end && A[i]==0 && sum==target){
             counter++;
             i++;
          }
          end++;
         
		}//
        return counter;
        
    }
}