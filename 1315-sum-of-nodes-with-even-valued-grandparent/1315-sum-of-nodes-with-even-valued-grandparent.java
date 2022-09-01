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
    int sum=0;
    
    public int sumEvenGrandparent(TreeNode root) {
         dfs(Integer.MIN_VALUE,Integer.MIN_VALUE,root);
        return sum;
    }
    
    public void dfs(int grandParent,int Parent,TreeNode root){
          if(root==null)
                    return ;
        
        if(grandParent!=Integer.MIN_VALUE && grandParent%2==0){
            sum+=root.val;
        }
        
        dfs(Parent,root.val,root.left);//tarverse the left side 
        dfs(Parent,root.val,root.right);//traverse the right side 
        
    }
}