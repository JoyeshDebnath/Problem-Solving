// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
           int n1 = m-l+1;
           int n2= r-m;
           
           int L[]=new int [n1];
           int R[]=new int [n2];
           
           for(int i=0;i<n1;i++)
           {
               L[i]=arr[l+i];
           }
           
           for(int j=0;j<n2;j++)
            {
                R[j]=arr[m+j+1];
            }
            
            int i=0;
            int j=0;
            int k=l;
            
          while(i<n1 && j<n2){
              
              if(L[i]<R[j])
              {
                  arr[k]=L[i];
                  i++;
                  k++;
              }
              else 
              {
                  arr[k]=R[j];
                  j++;
                  k++;
              }
              
            }
            
            //copy tyhe remaining elelements 
            while(i<n1)
            {
                arr[k]=L[i];
                i++;
                k++;
            }
            
            while(j<n2){
                arr[k]=R[j];
                j++;
                k++;
            }
            
    }//merge .....
    
    
    
    void mergeSort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;//find the mid index 
            mergeSort(arr,l,mid);
        
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }//merge sort 
}
