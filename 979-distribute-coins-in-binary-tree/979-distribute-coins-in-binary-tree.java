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
    int moves =0;
    
    public int distributeCoins(TreeNode root) {
        distribute(root);
        //number of nodes in subtree  ####  total number of coins in subtree 
        return moves;    
    }
    
    int[] distribute (TreeNode root){
        if(root==null)
              return new int[]{0,0};
        
        int left[]=distribute(root.left);
        int right[]=distribute(root.right);
        moves+=Math.abs(left[0]-left[1])+Math.abs(right[0]-right[1]);
        return new int[]{left[0]+right[0]+1,left[1]+right[1]+root.val};
    }
}