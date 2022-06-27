class Solution {
    public int[] sortArrayByParity(int[] A) {
       
        int i=0;
        int j=A.length-1;
        
        while(i<j)
        {
            if(A[i]%2==0)//1st is even 
                  i++;
            
            else //if 1st is odd 
            {
                //1st 1st odd   and last odd 
                if(A[j]%2!=0)
                     j--;
                else 
                {
                    //1st is odd and last is even 
                    swap(A,i,j);
                    i++;
                    j--;
                }
            }
        }//two pointer 
        return A;
    }
    
    void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }//swap
}