class Solution {
    Integer Memo[][];
    public int uniquePaths(int m, int n) {
        Memo=new Integer[m+1][n+1];
        // return findPaths(0,0,m,n);
        return findPathsTab(m,n);
        
    }
    
    int findPathsTab(int m,int n)
    {
        Integer dp[][]=new Integer[m+1][n+1];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                         dp[i][j]=1;
                          continue;
                }
                
                int down=0;
                int right=0;
                if(i==m-1){
                    right=dp[i][j+1];
                }
                if(j==n-1)
                    down= dp[i+1][j];
                if(i!=m-1 && j!=n-1)
                {
                    down = dp[i+1][j];
                    right=  dp[i][j+1];
                }
                dp[i][j]=(down+ right);
            }
        }
        return dp[0][0];
    }//tabulation version .... 
    
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
        
    }//mwmorissation soln 
}