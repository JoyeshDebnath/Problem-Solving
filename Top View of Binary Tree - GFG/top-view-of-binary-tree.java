// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    int hl;
    Node node;
    Pair(Node node,int hl)
    {
        this.node=node;
        this.hl=hl;
    }
}
class Solution
{
    
    static void width(Node root,int hl,int[] minmax){
        
        if(root==null)
        {
            return ;
        }
        
    minmax[0]=Math.min(minmax[0],hl);
    minmax[1]=Math.max(minmax[1],hl);
    
    width(root.left,hl-1,minmax);
    width(root.right,hl+1,minmax);
    
}//width 

  
    static ArrayList<Integer> topView(Node root)
    {
           int minmax[]=new int[2];//minmax[0]--->>min  AND  minmax[1]-->> max
           width(root,0,minmax);
           int len=Math.abs(minmax[0])+minmax[1]+1;
           
           
           ArrayList<Integer>[] vertical=new ArrayList[len];
           for(int i=0;i<len;i++)
                vertical[i]=new ArrayList<Integer>();
           
           Queue<Pair> q=new LinkedList<>();
           q.add(new Pair(root,Math.abs(minmax[0])));
           
           ArrayList<Integer> Ans=new ArrayList<>();//top view 
           
          while(!q.isEmpty()){
              
              int  sz=q.size();
              
              while(sz-->0){
                  
                  Pair rem=q.poll();
                  vertical[rem.hl].add(rem.node.data);
                  
                  if(rem.node.left!=null)
                             q.add(new Pair(rem.node.left,rem.hl-1));
                             
                  if(rem.node.right!=null)
                            q.add(new Pair(rem.node.right,rem.hl+1));
                            
              }
              
          } //while 
        
        for(int i=0;i<len;i++)
        {
            int val=vertical[i].get(0);
            Ans.add(val);
        }
        return Ans;
    }
}