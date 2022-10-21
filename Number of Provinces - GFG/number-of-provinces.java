//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[]){
        visited[node]=true;
        
        for(Integer it:adj.get(node)){
            if(visited[it]==false)
                 dfs(it,adj,visited);
        }
    }//dfs 
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        boolean visited[]=new boolean[V];
        Arrays.fill(visited,false);
        int counter=0;
        ArrayList<ArrayList<Integer>> newAdj=new ArrayList<>();
        for(int i=0;i<=V;i++)
             newAdj.add(new ArrayList<Integer>());
             
      for(int i=0;i<adj.size();i++){
          for(int j=0;j<adj.get(0).size();j++){
              if(i!=j && adj.get(i).get(j)==1)
              {
                   newAdj.get(i).add(j);
                   newAdj.get(j).add(i);
              }
          }
      }
       for(int i=0;i<V;i++){
            if(visited[i]==false)
            {
                counter++;
                dfs(i,newAdj,visited);
            }
       }
       return counter;
        
    }
};