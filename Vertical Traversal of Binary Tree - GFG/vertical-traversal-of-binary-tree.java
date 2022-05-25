// { Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
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

class GfG {
    
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
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}
// } Driver Code Ends


//User function Template for Java
class Pair {
    Node node;
    int hl;
    Pair(Node node,int hl)
    {
        this.node=node;
        this.hl=hl;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        int minHl=Integer.MAX_VALUE;
        int maxHl=Integer.MIN_VALUE;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        
         Queue<Pair> q=new LinkedList<>();
         q.add(new Pair(root,0));
         ArrayList<Integer> Ans=new ArrayList<>();
        
          while(!q.isEmpty())
          {
              int sz=q.size();
              
              while(sz-->0)
              {
                  Pair rem=q.poll();
                  map.putIfAbsent(rem.hl,new ArrayList<>());
                  
                  map.get(rem.hl).add(rem.node.data);
                  
                  minHl=Math.min(minHl,rem.hl);
                  maxHl=Math.max(maxHl,rem.hl);
                  
                  if(rem.node.left!=null)
                        q.add(new Pair(rem.node.left,rem.hl-1));
                
                 if(rem.node.right!=null)
                       q.add(new Pair(rem.node.right,rem.hl+1));
              }
              
          }
          
          //extract ans 
          for(int hl=minHl;hl<=maxHl;hl++){
              
              for(int val:map.get(hl)){
                  Ans.add(val);
              }
          }
          return Ans;
    }
}