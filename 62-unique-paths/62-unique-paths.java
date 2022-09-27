class Solution {
    Integer Memo[][];
    public int uniquePaths(int m, int n) {
        Memo=new Integer[m+1][n+1];
        return findPaths(0,0,m,n);
    }
    
    int findPaths(int i,int j,int m,int n)
    {
        if(i>=m || i<0 || j>=n || j<0)
             return 0;
        
        if(i==m-1 && j==n-1)
             return 1 ;
        
        if(Memo[i][j]!=null)
               return Memo[i][j];
        
        int down = findPaths(i+1,j,m,n);
        int right= findPaths(i,j+1,m,n);
        
        return Memo[i][j]=down+right;
        
    }
}