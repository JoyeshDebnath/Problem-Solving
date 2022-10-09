/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void inOrder(TreeNode root,List<Integer> nodes){
        if(root==null)
               return;
        
        inOrder(root.left,nodes);
        nodes.add(root.val);
        inOrder(root.right,nodes);
    }//
    
    
    public boolean findTarget(TreeNode root, int target) {
        List<Integer> nodes=new ArrayList<>();
        inOrder(root,nodes);
        for(int n:nodes)
              System.out.print(n+"   ");
        int i=0;
        int j=nodes.size()-1;
        while(i<j){
            int sum=nodes.get(i)+nodes.get(j);
            if(sum==target)
                  return true;
            
            if(sum>target)
                 j--;
            
            if(sum<target)
                i++;
        }
        return false;
    }
}