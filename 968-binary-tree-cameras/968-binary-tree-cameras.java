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
    int camera =0;
    
    public int minCameraCover(TreeNode root) {
        if(root==null)
              return 0;
        
        if(root.left==null && root.right==null)
            return 1;
        
        if(countCamera(root).equals("NEED"))
              camera++;
        
        return camera;
    }
    
   String countCamera(TreeNode root){
          //if the null then dont need 
       if(root==null)
           return "DONT_NEED";
       //if the leaf node then  need camera  to be watched 
       if(root.left==null && root.right==null)
           return "NEED";
    
       
       String left=countCamera(root.left);
       String right=countCamera(root.right);
       if(left.equals("NEED") || right.equals("NEED")){
           camera++;//
           return "CAMERA";
           
           }
       if(left.equals("CAMERA") || right.equals("CAMERA"))
           return "DONT_NEED";
       
       if(left.equals("DONT_NEED") && right.equals("DONT_NEED"))
       {
            // camera++;//
           return "NEED";
       }
       return "";
   }
}