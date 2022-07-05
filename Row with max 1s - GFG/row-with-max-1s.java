// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findIndexOfOne(int[] A,int n)
    {
        int lo=0;
        int hi=n-1;
        
        while(lo<=hi)
        {
              int mid =lo+(hi-lo)/2;
           
              if(A[mid]==0)
              {
                  lo=mid+1;
                  
              }
              else 
                 hi=mid-1;
        }
        
        return lo;
    }//find the index of first occurance of one 
    int rowWithMax1s(int arr[][], int n, int m) {
    
     int ans=0;
     int max=0;
    for(int i=0;i<n;i++)
    {
         int firstIndex=findIndexOfOne(arr[i],m);
         int count=m-firstIndex;
         if(count>max)
         {
             ans=i;
             max=count;
         }
           
           
    }
    return (max==0)?-1:ans;
    }
}