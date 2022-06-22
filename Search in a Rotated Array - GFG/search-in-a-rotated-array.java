// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        int lo=0;
        int hi=A.length-1;
        
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(A[mid]==key)
            {
                  return mid;
            }
            
            if(A[lo]<A[mid])
            {
                 if(key>=A[lo] && key<A[mid])
                      hi=mid-1;
                 else 
                      lo=mid+1;
                 
            }
            else 
            {
                   if(key>A[mid] && key<=A[hi])
                        lo=mid+1;
                
                   else 
                      hi=mid-1;
                
                   
                   
            }
            
        }
        return -1;
        
    }
}