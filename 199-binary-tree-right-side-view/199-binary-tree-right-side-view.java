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
    public List<Integer> rightSideView(TreeNode root) {
  Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		List<Integer> right=new ArrayList<>();
		if(root==null)
              return right;
		
		while(!q.isEmpty()){
			int n=q.size();
			for(int i=1;i<=n;i++)
			{
				TreeNode rem=q.poll();
				if(i==1)
				{
					right.add(rem.val);
				}
				if(rem.right!=null)
					  q.add(rem.right);
				if(rem.left!=null)
					       q.add(rem.left);
			}
			
		}//
		
		
		
		return right;
    }
}