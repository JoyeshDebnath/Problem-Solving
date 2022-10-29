//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        
        ArrayList<ArrayList<String>> Ans=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        
        Solve(S,0,list,Ans);
        return Ans;
    }
    
    public static void Solve(String str,int ind,ArrayList<String> list,ArrayList<ArrayList<String>> Ans){
        
        if(ind==str.length()){
            Ans.add(new ArrayList<>(list));
            return;
        }
        
        
        for(int i=ind;i<str.length();i++){
            String part=str.substring(ind,i+1);
            if(isValid(part.toCharArray())){
                list.add(part);
                Solve(str,i+1,list,Ans);
                
                list.remove(list.size()-1);
            }
        }
    }//Solve 
    
    public static boolean isValid(char[] S){
        int i=0;
        int j=S.length-1;
        
        while(i<j){
            if(S[i]!=S[j])
            {
               return  false;
            }
            i++;
            j--;
        }//
        
        return true;
        
        
    }
};