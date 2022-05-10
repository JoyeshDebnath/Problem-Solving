class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m*n-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            
            int mid_val=matrix[mid/n][mid%n];
            if(mid_val==target)
                return true;
            
            if(mid_val>target)
                  end=mid-1;
            else 
                start=mid+1;
        }
        
        return false;
    }
}
