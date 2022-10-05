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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
         TreeNode Root=new TreeNode(val);
            Root.left=root;
            return Root;
        }
         solve(depth,val,root,2); 
        return root;
    }
    
    public void solve(int depth,int val,TreeNode root,int currD){
        if(root==null)
              return ;
        
        if(currD==depth){
            TreeNode leftSub=root.left;
            TreeNode rightSub=root.right;
            root.left=new TreeNode(val);
            root.right=new TreeNode(val);
            root.left.left=leftSub;
            root.right.right=rightSub;
            return ;
        }
        
        solve(depth,val,root.left,currD+1);
        solve(depth,val,root.right,currD+1);
        
    }
}