class Solution {
    public int findKthLargest(int[] A, int k) {
        
        int lo=0;
        int hi=A.length-1;
        k=A.length-k;
        while(lo<=hi){
            int i=lo;//pivot
            int pivot =A[lo];
            for(int j=lo+1;j<=hi;j++)
            {
                 if(A[j]<pivot)
                       swap(A,j,++i);
            }
           
            swap(A,lo,i);//swap pivot with i to put it in its correct position 
            int pIndex=i;
            if(k<pIndex)
                   hi=pIndex-1;
            else if(k>pIndex)
                   lo=pIndex+1;
            else 
                  return A[pIndex];
                
            
        }//loop 
        return -1;
    }
    
    void swap(int A[],int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}