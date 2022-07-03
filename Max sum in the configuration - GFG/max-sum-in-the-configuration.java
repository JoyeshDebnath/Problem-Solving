// { Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    int max_sum(int A[], int n)
    {

     int  currSum=0;
     int currVal=0;
     
     for(int ele:A)
          currSum+=ele;

     for(int i=0;i<n;i++)
     {
         currVal+=(i*A[i]);
     }
     
     int res=currVal;//res of the original configuratio  
     
     for(int i=1;i<n;i++)
     {
           int nextVal=currVal-(currSum-A[i-1])+(A[i-1]*(n-1));
           currVal=nextVal;
           res=Math.max(res,nextVal);
     }
     
     return res;
    }	
}
