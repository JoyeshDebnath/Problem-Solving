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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set <Integer> child=new HashSet<>();//find the childs 
        Map<Integer,List<int[]>> map=new HashMap<>();
        
        for(int des[]:descriptions )
        {
              if(map.containsKey(des[0])==false){
                  int temp[]=new int[]{des[1],des[2]};//child , left/right indicator 
                  List<int[]> list=new ArrayList<>();
                  list.add(temp);
                  map.put(des[0],list);
              }
            else {
                List<int[] > tempList=map.get(des[0]);
                 int temp[]=new int[]{des[1],des[2]};//child , left/right indicator                  
                tempList.add(temp);
            }
              child.add(des[1]);
        }
        
        int Parent=0;
        
        for(int des[]:descriptions){
           if(child.contains(des[0])==false)
           {
               Parent=des[0];
               break;
           }
        }
        for(int k:map.keySet()){
            List<int[] > temp=map.get(k);
            for(int[] a:temp)
            {
                System.out.print(k+"   "+a[0]+"    "+a[1] +"  , ");
            }
         System.out.println();
        }
        System.out.println("Found the Parent!="+Parent);
            
            return solve(Parent,map);
        // return new TreeNode(0);
        
    }
        
        TreeNode solve(int Parent,Map<Integer,List<int[]>> map){
            
            if(!map.containsKey(Parent)){
                   return new TreeNode(Parent);
            }
            
            TreeNode root=new TreeNode (Parent);
            //iterate over the childrens 
            // for(int KEY:map.keySet()){
                List<int[]> list=map.get(Parent);//list of (child,direction)
                System.out.println("Size-"+list.size());
                
                for(int[] temp:list){
                    int direction=temp[1];
                    int child=temp[0];
                    if(direction==1){
                        root.left=solve(child,map);
                    }
                    else
                        root.right=solve(child,map);
                }
            // }
            
            return root;
        }
}
    