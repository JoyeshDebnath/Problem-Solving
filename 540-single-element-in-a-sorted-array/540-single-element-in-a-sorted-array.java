class Solution {
    public int singleNonDuplicate(int[] A) {
        int N=A.length;
        int left=0;
        int right=N-1;
        
        while(left<right){
            
            int mid=(left+right)/2;
            if((mid%2==0 && A[mid]==A[mid+1]) || (mid%2==1 && A[mid]==A[mid-1])){
                left=mid+1;
            } 
            else{
                right=mid;
            }
            
        }//loop
        
        return A[left];
    }
}