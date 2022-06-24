// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
     int currSum=0;
     HashMap<Integer,Integer> map=new HashMap<>();
     int start=0;
     int end =-1;
     
     map.put(0,-1);//0 sum occur at index -1 
     for(int i=0;i<arr.length;i++)
     {
           currSum=currSum+arr[i];
           if(map.containsKey(currSum-sum))
           {
               start=map.get(currSum-sum)+1;
               end=i;
               break;
           }
        
            map.put(currSum,i);
        
    }
    
    ArrayList<Integer> ans =new ArrayList<>();
    if(end!=-1)
    {
    ans.add(start+1);
    ans.add(end+1);
    }
    else 
    {
        ans.add(-1);
    }
    return ans;
    } 
}