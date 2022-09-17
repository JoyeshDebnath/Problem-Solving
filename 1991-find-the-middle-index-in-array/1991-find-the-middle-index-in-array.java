class Solution {
    public int findMiddleIndex(int[] A) {
        int leftSum=0;
        int i=0;
        int total=0;
        for(int val:A)
              total+=val;
       
        int N=A.length;
        // if(N==1)
        //       return 0;
        
       for(i=0; i<N; i++){
           
           if(leftSum == total-leftSum-A[i]) 
                return i;
            
           leftSum+=A[i];
        }
        return -1;
        
    }
}