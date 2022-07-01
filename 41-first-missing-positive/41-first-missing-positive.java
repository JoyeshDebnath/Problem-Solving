class Solution {
    void swap(int[] A,int i,int j)
    {
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
    }
    
    public int firstMissingPositive(int[] A) {
        int n=A.length;
        int i=0;
        
        while(i<n)
        {
            if(A[i]==i+1 || A[i]<=0 || A[i]>n)
            {
                  i++;
            }
            else if(A[A[i]-1]!=A[i])
            {
                swap(A,i,A[i]-1);
            }
            else 
                i++;
        }
        i=0;
        while(i<n && A[i]==i+1)
        {
            i++;
        }
        return i+1;
        
    }
}