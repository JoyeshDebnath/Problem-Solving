//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<String> wordBreak(int n, List<String> dict, String strs)
    {
        
        List<String> words=new ArrayList<>();
		List<String> sentence=new ArrayList<>();
		Solve(0,dict,strs,sentence,words);
		return sentence;
        
    }
    
    
    public static String formSentence(List<String> words){
   	String sent="";

   	for(String word:words){
   		sent=sent+" "+word;
   	}
   	return sent.trim();
   }
   
   
    public static void Solve(int ind,List<String> dict,String strs,List<String> sentence,List<String> words){

   		if(ind>=strs.length())
   		{
   			String sent=formSentence(words);
   			sentence.add(sent);
   			return ;
   		}//base case


   		
   		String wrd="";

   		for(int i=ind;i<strs.length();i++){
   			wrd+=strs.charAt(i);

   			if(dict.contains(wrd)){
   				words.add(wrd);
   				Solve(i+1,dict,strs,sentence,words);
   			    words.remove(words.size()-1);
   			}
   		} 
   }//form sentence 

}