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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> Ans=new ArrayList<>();
        List<Integer> del_list=new ArrayList<>();
        for(int v:to_delete)
              del_list.add(v);
        
        postOrder(root,del_list,Ans);
        if(del_list.contains(root.val)==false)
              Ans.add(root);
        
        return Ans; 
    }
    
    TreeNode postOrder(TreeNode root,List<Integer> del_list,List<TreeNode> Ans)
    {
        if(root==null)
                return null;
        root.left=postOrder(root.left,del_list,Ans);
        root.right=postOrder(root.right,del_list,Ans);
        if(del_list.contains(root.val)){
            //this needs to be deleted 
            if(root.left!=null)
                   Ans.add(root.left);
            if(root.right!=null)
                   Ans.add(root.right);
            root=null;//make it null
            
        }
        return root;
        
    }
}