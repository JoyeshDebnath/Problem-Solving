class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        
        int n=A.length;
        if(A.length!=B.length)
               return -1;
        
        
        int countA[]=new int[7];
        int countB[]=new int[7];
        int same[]=new int[7];
        
        for(int i=0;i<A.length;i++)
        {
            ++countA[A[i]];
            ++countB[B[i]];
            
            if(A[i]==B[i])
            {
                ++same[A[i]];
            }
        }
    
        for(int i=0;i<7;i++)
        {
            if(countA[i]+countB[i]-same[i]==n)
            {
                return Math.min(countA[i],countB[i])-same[i];
            }
        }
    return -1;
        
    }
}