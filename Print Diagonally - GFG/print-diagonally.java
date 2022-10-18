//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
       //upper half 
       //mid part 
       //lower half 
       ArrayList<Integer> Ans=new ArrayList<>();
       for(int k=0;k<N;k++){
           int j=k;
           int i=0;
           while(j>=0){
               Ans.add(A[i][j]);
               j--;
               i++;
           }
      }//upper part and mid 
      
      //lower half 
      for(int k=1;k<N;k++){
          int j=N-1;
          int i=k;
          while(i<N){
              Ans.add(A[i][j]);
              j--;
              i++;
          }
      }//outer 
       
       return Ans;
    }
}
