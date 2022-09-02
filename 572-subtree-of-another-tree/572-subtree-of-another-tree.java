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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
             return  findSubTree(root,subRoot);
    }
    
    public boolean findSubTree(TreeNode root,TreeNode subRoot){
        if(root==null)
                 return false;
        
       
        if (isSame(root,subRoot))
                 return  true;
        
        return findSubTree(root.left,subRoot) || findSubTree(root.right,subRoot);
    
    }
    
    public boolean isSame(TreeNode root1,TreeNode root2){
         if(root1==null && root2==null)
                               return true;
          if(root1==null)
                    return  false;
          if(root2==null)
                      return false;
        
         if(root1.val!=root2.val)
                            return false ;
   
        return isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
    
    }
}