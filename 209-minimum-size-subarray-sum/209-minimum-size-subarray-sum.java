class Solution {
    public int minSubArrayLen(int target, int[] A) {
         int s=0;
        for(int num:A){
        s+=num;
        }
        if(s<target){
            // System.out.println("Not Possible!");
            return 0;
        }

        int start=0;
        int end =0;
        int N=A.length;
        int ansLen=Integer.MAX_VALUE;
        int sum=0;

        while(end<N){
     
         sum+=A[end];
         if(sum>=target){
           while(sum>=target && start<=end){
              ansLen=Math.min(ansLen,end-start+1);
              sum-=A[start];
              start++;
           }
         }
         end++;
        }

        if(sum>=target){
        ansLen=Math.min(ansLen,end-start+1);
        }
        return ansLen;
    }
}