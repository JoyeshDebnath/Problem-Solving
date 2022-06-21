// { Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int A[], int lo, int hi)
    {
         if(lo<hi)
         {
             int pi=partition(A,lo,hi);//find the proper partitioning indx 
             quickSort(A,lo,pi-1);//left side 
             quickSort(A,pi+1,hi);//right side 
             
         }
    }
    static int partition(int A[], int lo, int hi)
    {
        //last element is made  pivot 
        int pivot=A[hi];
        int i=lo-1;
        
        for(int j=lo;j<=hi-1;j++)
        {
             if(A[j]<pivot)
             {
                 i++;
                 swap(A,i,j);
             }
        }
        swap(A,i+1,hi);
        return i+1;
}

public static  void swap(int[] A,int i,int j)
{
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
}
}