// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    
   static int greaterThanOrEqualCount(int mat[][],int val)
   {
       int counter=0;
       
       for(int i=0;i<mat.length;i++)
       {
           for(int j=0;j<mat[0].length;j++)
           {
               if(mat[i][j]<=val)
                    counter++;
           }
       }
       return counter;
   }
	public static int kthSmallest(int[][] mat,int n,int k)
	{
        
        int lo=mat[0][0];
        int hi=mat[n-1][n-1];
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            int count=greaterThanOrEqualCount(mat,mid);
            if(count<k)
              lo=mid+1;
             
            else 
               hi=mid-1;
            
        }
        
        return lo;
    }
}