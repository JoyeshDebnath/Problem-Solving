class Solution {
    public int numIslands(char[][] M) {
        int m=M.length;
        int n=M[0].length;
        int grid[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++){
        		if(M[i][j]=='0')
        			   grid[i][j]=0;
        		else 
        			   grid[i][j]=1;
        	}
        }

        int counter=0;

        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(grid[i][j]==0)
        			    continue;
        		else{
        			counter++;
        			dfsAndMark(grid,i,j,m,n);
        		}
        	}//inner 
        }//outer
        return counter;
    }
    
    
    public  void dfsAndMark(int[][] grid,int i,int j,int m,int n){
         if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0)
         	 return;

         grid[i][j]=0;

         dfsAndMark(grid,i,j+1,m,n);
         dfsAndMark(grid,i,j-1,m,n);
         dfsAndMark(grid,i-1,j,m,n);
         dfsAndMark(grid,i+1,j,m,n);
	}//dfs 
}