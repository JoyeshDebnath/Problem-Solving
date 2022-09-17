class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
       int Sum=0;
       for(int val:A)
             Sum+=val;
       if(Sum%3!=0)
              return false;
        
        int avg=Sum/3;//3 parts so avg divide by 3
      
          int leftInd=0;
        int rightInd=A.length-1;
        int leftSum=A[leftInd++];
        int rightSum=A[rightInd--];
      
        
        while(leftInd<rightInd){
        if(leftSum!=avg && leftInd<rightInd)
                leftSum+=A[leftInd++];
            
        if(rightSum!=avg && leftInd<rightInd)    
                 rightSum+=A[rightInd--];
            
              // System.out.println("Value of leftSum"+leftSum);
              // System.out.println("Value of left index"+leftInd);
              // System.out.println("Value of rightSum"+rightSum);
              // System.out.println("Value of right index"+rightInd);
            
           if(leftSum==avg && rightSum==avg && leftInd<=rightInd)
                         return true;
         
        }//
              System.out.println("Value of leftSum"+leftSum);
              System.out.println("Value of left index"+leftInd);
              System.out.println("Value of rightSum"+rightSum);
              System.out.println("Value of right index"+rightInd);
        return false;
    }
}