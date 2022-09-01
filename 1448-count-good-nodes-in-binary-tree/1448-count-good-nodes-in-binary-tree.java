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
    int goodCnt=0;
    public int goodNodes(TreeNode root) {
        
        dfs(Integer.MIN_VALUE,root);
        return goodCnt;
    }
    
    public void dfs(int maxmTillNow,TreeNode root){
        if(root==null)
              return;
        
        if(root.val>=maxmTillNow)
        {
            goodCnt++;
        }
        
        dfs(Math.max(root.val,maxmTillNow),root.left);
        dfs(Math.max(root.val,maxmTillNow),root.right);
    }
}