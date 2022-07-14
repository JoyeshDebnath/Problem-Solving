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
// class Solution {
//     public int maxProduct(TreeNode root) {
//         HashSet<Long> sums=new HashSet<>();
//         int total=dfs(root,sums);
//         long max=0;
        
//         for(long sum:sums)
//                 max=Math.max(max,sum*(total-sum));
        
//         return (int)max%1000000007;
//     }
    
    
//     public int  dfs(TreeNode root,HashSet<Long> sums)
//     {
//         if(root==null)
//                return 0;
        
//         root.val+=dfs(root.left,sums);
//         root.val+=dfs(root.right,sums);
//         sums.add((long)root.val);
//         return root.val;
//     }
// }

class Solution {
      int MOD = (int) (1e9) + 7;
    public int maxProduct(TreeNode root) {
        Set<Long> sums = new HashSet<>();
        int total = dfs(root, sums);
        long max = 0;
        for (long sum : sums) {
            max = Math.max(max, sum * (total - sum));
        }
        return (int) (max % MOD);
    }
    public int dfs(TreeNode root, Set<Long> sums) {
        if (root == null)
            return 0;
        root.val += dfs(root.left, sums);
        root.val += dfs(root.right, sums);
        sums.add((long) (root.val));
        return root.val;
    }
}