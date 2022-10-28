//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] grid, int n) {
        int m=grid.length;
      
           ArrayList<String> AllPaths=new ArrayList<>();//all paths 
           // StringBuilder Path=new StringBuilder();
           boolean visited[][]=new boolean [m][n];
          findPath(grid,0,0,m,n,visited,AllPaths,"");
          return AllPaths;
    }
    
    public static void  findPath(int grid[][],int i,int j,int m,int n,boolean[][] vis,ArrayList<String> AllPaths,String Path){
		if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0 || vis[i][j]==true)
			return ;

		if(i==(m-1) && j==(n-1))
		{
			if(grid[i][j]==1)
				   AllPaths.add(Path);
			
				return;
		}//last cell target cell is reached 

		if(grid[i][j]==1){
			vis[i][j]=true;
		}

		findPath(grid,i,j+1,m,n,vis,AllPaths,Path+"R");
		findPath(grid,i,j-1,m,n,vis,AllPaths,Path+"L");
		findPath(grid,i+1,j,m,n,vis,AllPaths,Path+"D");
		findPath(grid,i-1,j,m,n,vis,AllPaths,Path+"U");
        
        vis[i][j]=false;

	}//find Paths 
}