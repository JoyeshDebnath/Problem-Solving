class Solution {
    public int[] sortedSquares(int[] A) {
        int i=0;
        int j=A.length-1;
        int Res[]=new int[A.length];
        int p;
        
        for(p=A.length-1;p>=0;p--){
           if(Math.abs(A[i])>Math.abs(A[j]))
           {
                Res[p]=A[i]*A[i];
                i++;
           }
            else{
                Res[p]=A[j]*A[j];
                j--;
            
            }
        }
       return Res; 
    }
}