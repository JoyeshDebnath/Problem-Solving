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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> Ans=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            
            int sz=q.size();
            int SZ=sz;
            double sum=0.0;
            double avg=0.0;
            while(sz-->0){
               TreeNode rem=q.poll();
                sum+=rem.val;
                if(rem.left!=null)
                         q.add(rem.left);
                if(rem.right!=null)
                       q.add(rem.right);
            }
            avg=sum/SZ;
            Ans.add(avg);
        }
        return Ans;
    }
}