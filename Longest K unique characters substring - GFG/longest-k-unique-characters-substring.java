//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
       char[] S=s.toCharArray();
      int start=0;
      int end=0;
      int n=s.length();
      int maxm=0;
      
      Map<Character,Integer> map=new HashMap<>();
      while(end<n){
           map.put(S[end],map.getOrDefault(S[end],0)+1);
           while(start<end && map.size()>k){
               map.put(S[start],map.get(S[start])-1);
               if(map.get(S[start])==0)
                         map.remove(S[start]);
            start++;
           }
           if(map.size()==k){
           int currWindowSize=end-start+1;
           maxm=Math.max(maxm,currWindowSize);
           }
           end++;
      }
      if(map.size()==k){
      int currWindowSize=end-start;
           maxm=Math.max(maxm,currWindowSize);
      }
      return (maxm==0)?-1:maxm;
    }
}