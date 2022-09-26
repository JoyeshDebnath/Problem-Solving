class Solution {
    Integer Memo[][];
    public int minPathSum(int[][] grid) {
        Memo=new Integer[grid.length][grid[0].length];
        // return minPathUtil(0,0,grid.length,grid[0].length,grid);
        return minPathTab(grid.length,grid[0].length,grid);
    }
    
    int minPathTab(int m,int n,int[][] grid){
        Integer dp[][]=new Integer[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                  if(i==(m-1) && j==(n-1))
                           dp[m-1][n-1]=grid[m-1][n-1];
                
                  else if(i==(m-1))
                          dp[i][j]=grid[i][j]+dp[i][j+1];
                
                  else if(j==(n-1))
                           dp[i][j]=grid[i][j]+dp[i+1][j];
                
                  else 
                          dp[i][j]=grid[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
            }
        }
        
        return dp[0][0];
        
        
    }//tabulation soln 
    
    
    int minPathUtil(int i,int j,int m,int n,int grid[][]){
        if(i==m-1 && j==n-1){
            return grid[m-1][n-1];
        }
        if(i<0 || i>=m || j<0 || j>=n)
              return (Integer.MAX_VALUE-1);
        
        if(Memo[i][j]!=null)
                   return Memo[i][j];
                
        int downSum=minPathUtil(i+1,j,m,n,grid);
        int rightSum=minPathUtil(i,j+1,m,n,grid);
        return Memo[i][j]=Math.min(downSum,rightSum)+grid[i][j];
    }//Rec || Memo
}