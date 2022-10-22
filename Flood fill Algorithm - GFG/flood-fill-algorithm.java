//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] floodFill(int[][] grid, int sr, int sc, int newColor)
    {
       
         int m=grid.length;
         int n=grid[0].length;
         int originalColor=grid[sr][sc];

         dfsAndColor(grid,sr,sc,m,n,originalColor,newColor);
         return grid;
    }
    
    public static void dfsAndColor(int[][] grid,int i,int j,int m,int n,int originalColor,int newColor){
         if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==newColor || grid[i][j]!=originalColor )
         	   return ;

         grid[i][j]=newColor;
         dfsAndColor(grid,i-1,j,m,n,originalColor,newColor);
         dfsAndColor(grid,i+1,j,m,n,originalColor,newColor);
         dfsAndColor(grid,i,j-1,m,n,originalColor,newColor);
         dfsAndColor(grid,i,j+1,m,n,originalColor,newColor);

    }//dfs
}