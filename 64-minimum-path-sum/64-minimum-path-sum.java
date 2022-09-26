class Solution {
    Integer Memo[][];
    public int minPathSum(int[][] grid) {
        Memo=new Integer[grid.length][grid[0].length];
        return minPathUtil(0,0,grid.length,grid[0].length,grid);
    }
    
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
    }
}